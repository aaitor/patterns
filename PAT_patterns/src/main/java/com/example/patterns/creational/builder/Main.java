package com.example.patterns.creational.builder;

/**
 * Separate the construction of a complex object from its representation so 
 * that the same construction process can create different representations.
 *  
 * @author aitor
 *
 */

public class Main {

	public static void main(String[] args)	{
		RobotBuilder oldStyleRobot= new OldRobotBuilder();
		
		RobotDirector director= new RobotDirector(oldStyleRobot);
		
		director.makeRobot();
		
		Robot firstRobot= director.getRobot();
		
		System.out.println("Robot Built");		
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());		
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());		
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());		
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());		
	}
	
}
