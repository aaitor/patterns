package com.example.patterns.creational.abstractfactory;

public abstract class EnemyShip {

	private String name;
	private double speed;
	private double damage;
	private ESWeapon weapon;
	private ESEngine engine;
	
	abstract void makeShip();
	
	public String toString()	{
		return "The " + name  + " has a top speed of " +
				" engine and an attack power of " + weapon;
	}
	
	public String getName() {
		return name;
	}
	public EnemyShip setName(String name) {
		this.name = name;
		return this;
	}
	public double getSpeed() {
		return speed;
	}
	public EnemyShip setSpeed(double speed) {
		this.speed = speed;
		return this;
	}
	public double getDamage() {
		return damage;
	}
	public EnemyShip setDamage(double damage) {
		this.damage = damage;
		return this;
	}
	public ESWeapon getWeapon() {
		return weapon;
	}
	public EnemyShip setWeapon(ESWeapon weapon) {
		this.weapon = weapon;
		return this;
	}
	public ESEngine getEngine() {
		return engine;
	}
	public EnemyShip setEngine(ESEngine engine) {
		this.engine = engine;
		return this;
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");		
	}

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine );
		
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + weapon);
		
	}
	
	
	
}
