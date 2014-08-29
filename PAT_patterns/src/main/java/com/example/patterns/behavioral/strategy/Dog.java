package com.example.patterns.behavioral.strategy;

public class Dog extends Mammal {
	
	public Dog()	{
		super();		
		setName("Dog name");
		setFlysAbility(new CantFly());
		setSwimAbility(new ItSwim());
	}
}
