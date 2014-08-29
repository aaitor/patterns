package com.example.patterns.creational.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		EnemyShipFactory shipFactory= new EnemyShipFactory();
		EnemyShip theEnemy= null;
		
		Scanner userInput= new Scanner(System.in);
		
		System.out.println("What type of ship? (U/R/B)");
		
		if (userInput.hasNextLine())	{
			theEnemy= shipFactory.makeEnemyShip(userInput.nextLine());
		}
		
		if (theEnemy != null)	{
			doStuffEnemy(theEnemy);
		}	else 	{
			System.out.println("Enter a U, R or B next time");
		}
	}

	private static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}

}
