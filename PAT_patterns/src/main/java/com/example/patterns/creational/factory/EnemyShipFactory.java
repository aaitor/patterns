package com.example.patterns.creational.factory;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip= null;
		
		
		
		if (newShipType.equals("U"))	{
			newShip= new UfoEnemyShip();
		}	else if (newShipType.equals("R"))	{
			newShip= new RocketEnemyShip();
		}	else if (newShipType.equals("B"))	{
			newShip= new BigUfoEnemyShip();
		}	else	{
			return null;
		}
		return newShip;
	}
	
}
