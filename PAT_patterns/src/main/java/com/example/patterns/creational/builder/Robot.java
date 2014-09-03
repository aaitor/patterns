package com.example.patterns.creational.builder;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public Robot setRobotHead(String head) {
		robotHead= head;
		return this;
	}
	
	public String getRobotHead()	{
		return robotHead;
	}
	
	public Robot setRobotTorso(String torso) {
		robotTorso= torso;
		return this;
	}
	
	public String getRobotTorso()	{
		return robotTorso;
	}
		
	public Robot setRobotArms(String arms) {
		robotArms= arms;
		return this;
	}
	
	public String getRobotArms()	{
		return robotArms;
	}
		
	public Robot setRobotLegs(String legs) {
		robotLegs= legs;
		return this;
	}

	public String getRobotLegs()	{
		return robotLegs;
	}
	
	
}
