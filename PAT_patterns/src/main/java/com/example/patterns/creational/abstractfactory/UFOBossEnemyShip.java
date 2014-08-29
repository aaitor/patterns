package com.example.patterns.creational.abstractfactory;

public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory enemyFactory;
	
	public UFOBossEnemyShip(EnemyShipFactory factory)	{
		this.enemyFactory= factory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemy ship "+ getName());
		setWeapon(enemyFactory.addESGun());
		setEngine(enemyFactory.addESEngine());
	}
	
}