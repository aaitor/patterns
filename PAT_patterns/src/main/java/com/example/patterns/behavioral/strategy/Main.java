package com.example.patterns.behavioral.strategy;

public class Main {

	public static void main(String[] args) {

		Animal cat1= new Cat();
		Animal pidgeon1= new Pidgeon();
		Animal penguin1= new Penguin();
		Animal shark1= new Shark();
		Animal dog1= new Dog();
		
		System.out.println("Cat: " + cat1.getFlysAbility().fly() + " - " + cat1.getSwimAbility().swim());
		
		System.out.println("Pidgeon: " + pidgeon1.getFlysAbility().fly() + " - " + pidgeon1.getSwimAbility().swim());
		
		System.out.println("Penguin: " + penguin1.getFlysAbility().fly() + " - " + penguin1.getSwimAbility().swim());
		
		System.out.println("Shark: " + shark1.getFlysAbility().fly() + " - " + shark1.getSwimAbility().swim());
		
		System.out.println("Dog: " + dog1.getFlysAbility().fly() + " - " + dog1.getSwimAbility().swim());
		
		cat1.setFlysAbility(new ItFlys());
		System.out.println("Cat: " + cat1.getFlysAbility().fly() + " - " + cat1.getSwimAbility().swim());
	}

}
