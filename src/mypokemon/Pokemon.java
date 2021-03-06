
package mypokemon;

abstract class Pokemon{
	public final double maxHealth;
	protected double health,weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;

	public Pokemon(String name, double maxHealth ,double weight){
		this.name = name;
                this.weight = weight; 
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
        
        public double getWeight(){
		return this.weight;
	}
        
        public void setWeight(double weight){
		this.weight = weight;
	}

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                this.weight+= berry.getRestoreValue()/5.0;
	}
        
        public void excercise(Excercise ex){
            if(this.weight- (ex.getRestoreValue()/5.0) <0){
                this.weight = 0;
            }
            else{
                this.weight-= ex.getRestoreValue()/5.0;
            }
                
	}
        

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
	}

	abstract public void move();

}
//
