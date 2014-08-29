package com.example.patterns.creational.abstractfactory;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		EnemyShipBuilding makeUFOs= new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt= makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");

		EnemyShip theBoss= makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");		
						
	}

}
