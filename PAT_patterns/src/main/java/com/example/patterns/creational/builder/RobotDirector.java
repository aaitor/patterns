package com.example.patterns.creational.builder;

public class RobotDirector {

	private RobotBuilder builder;
	
	public RobotDirector(RobotBuilder builder)	{
		this.builder= builder;
	}
	
	public Robot getRobot()	{
		return builder.getRobot();
	}
	
	public void makeRobot()	{
		builder.buildRobotHead();
		builder.buildRobotTorso();
		builder.buildRobotArms();
		builder.buildRobotLegs();
	}	
	
}
