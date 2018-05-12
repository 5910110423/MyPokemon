package mypokemon;



/**
 *
 * @author NICK
 */
public class Excercise {
    private String name;
	private float restoreValue;
	private int type;

	public Excercise(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Walk";
				this.restoreValue = 10;
				break;
			case 1: this.name = "Run";
				this.restoreValue = 15;
				break;
			case 2: this.name = "Swim";
				this.restoreValue = 20;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
}
