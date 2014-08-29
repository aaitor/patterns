package com.example.patterns.creational.abstractfactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemy= null;
		EnemyShipFactory shipFactory= null;
		
		if (typeOfShip.equalsIgnoreCase("UFO"))	{
			shipFactory= new UFOEnemyShipFactory();
			theEnemy= new UFOEnemyShip(shipFactory);
			theEnemy.setName("UFO Grunt Ship");
			
		}	else if (typeOfShip.equalsIgnoreCase("UFO BOSS"))	{
			shipFactory= new UFOBossEnemyShipFactory();
			theEnemy= new UFOBossEnemyShip(shipFactory);
			theEnemy.setName("UFO Grunt Ship");
			
		}
		
		return theEnemy;
	}

}
