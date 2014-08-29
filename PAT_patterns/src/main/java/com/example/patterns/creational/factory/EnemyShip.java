package com.example.patterns.creational.factory;

public abstract class EnemyShip {

	private String name;
	private double damage;
	
	
	public String getName() {
		return name;
	}
	public EnemyShip setName(String name) {
		this.name = name;
		return this;
	}
	public double getDamage() {
		return damage;
	}
	public EnemyShip setDamage(double damage) {
		this.damage = damage;
		return this;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage() + " of damage");
	}
	
	
}