package project;

public class Plant extends Creature {

	public Plant() {
		super(0.5);
	}
	public void setHealth(double pHealth) {
		if(pHealth<=1.0) {
			super.setHealth(pHealth);
		}
	}
	
}
