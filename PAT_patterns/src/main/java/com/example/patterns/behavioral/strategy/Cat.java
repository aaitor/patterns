package com.example.patterns.behavioral.strategy;

public class Cat extends Mammal {
	
	public Cat()	{
		super();		
		setName("Cat name");
		setFlysAbility(new CantFly());
		setSwimAbility(new CantSwim());
	}

}
