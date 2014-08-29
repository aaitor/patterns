package com.example.patterns.behavioral.strategy;

public class Shark extends Fish {

	public Shark()	{
		super();
		setName("Shark name");
		setFlysAbility(new CantFly());
		setSwimAbility(new ItSwim());
	}
}
