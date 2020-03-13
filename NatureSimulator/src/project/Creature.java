package project;

import game.Drawable;

public class Creature implements Drawable{
	private double health;
	
	public Creature(double pHealth) {
		this.health=pHealth;
	}
	/**
	 * getHealth
	 * @return health
	 */
	public double getHealth() {
		return this.health;
	}
	public void setHealth(double pHealth) {
		
		this.health=pHealth;
	}
	/*
	 * 
	 */
}
