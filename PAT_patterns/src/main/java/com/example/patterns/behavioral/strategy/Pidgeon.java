package com.example.patterns.behavioral.strategy;

public class Pidgeon extends Bird {

	public Pidgeon()	{
		super();
		setName("Pidgeon name");
		setFlysAbility(new ItFlys());
		setSwimAbility(new CantSwim());
	}	
}
