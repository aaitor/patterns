package com.example.patterns.creational.abstractfactory;

public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemy= makeEnemyShip(typeOfShip);
		
		theEnemy.makeShip();
		theEnemy.displayEnemyShip();
		theEnemy.followHeroShip();
		theEnemy.enemyShipShoots();
		
		return theEnemy;
	}

	
	
}
