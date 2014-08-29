package com.example.patterns.behavioral.strategy;

public class Animal {

	private String name;
	private double speed;
	private String sound;
	private Flys flys;
	private Swim swim;
	
	public Animal setName(String newName)	{
		name= newName;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public Animal setSpeed(double newSpeed)	{
		speed= newSpeed;
		return this;
	}
	
	public double getSpeed()	{
		return speed;
	}
	
	public Animal setSound(String newSound)	{
		sound= newSound;
		return this;
	}

	public String getSound() {
		return sound;
	}

	public Flys getFlysAbility() {
		return flys;
	}

	public Animal setFlysAbility(Flys flys) {
		this.flys = flys;
		return this;
	}

	public Swim getSwimAbility() {
		return swim;
	}

	public Animal setSwimAbility(Swim swim) {
		this.swim = swim;
		return this;
	}
	
	
}
