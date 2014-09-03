package com.example.patterns.creational.builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder()	{
		this.robot= new Robot();
	}
	
	public void buildRobotHead() {
		robot.setRobotHead("Tin head");		
	}

	public void buildRobotTorso() {
		robot.setRobotTorso("Fat torso");		
	}

	public void buildRobotArms() {
		robot.setRobotArms("Tin ARms");
		
	}

	public void buildRobotLegs() {
		robot.setRobotLegs("Roller legs");		
	}

	public Robot getRobot() {
		return this.robot;
	}
	


}
