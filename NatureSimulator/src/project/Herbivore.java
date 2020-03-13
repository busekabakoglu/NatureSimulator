package project;

public class Herbivore extends Creature{

	public Herbivore(double pHealth) {
		super(10.0);
	}
	/**
	 * 
	 */
	public void setHealth(double pHealth) {
		if(pHealth<=20.0) {
			super.setHealth(pHealth);
		}
	}
}
