package com.example.patterns.creational.builder;

public interface RobotPlan {

	public RobotPlan setRobotHead(String head);
	
	public RobotPlan setRobotTorso(String torso);

	public RobotPlan setRobotArms(String arms);

	public RobotPlan setRobotLegs(String legs);

}
