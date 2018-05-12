/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypokemon;


public class Lugia extends Pokemon implements Runnable {
    private static final int maxGroupHealth = 200;
	public Lugia(){
		super("Lapras",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000) % (100+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("tail whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse2");
	}

	public void move(){
		this.swim();
	}

	public void run(){
		this.reducedHealth(10);
	}

	public void walk(){
		this.reducedHealth(1);
	}
        
        public void swim(){
		this.reducedHealth(5);
	}
        
    
}
