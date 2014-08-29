package com.example.patterns.behavioral.strategy;

public class Penguin extends Bird {
	
	public Penguin()	{
		super();
		setName("Penguin name");
		setFlysAbility(new CantFly());
		setSwimAbility(new ItSwim());
	}
}
