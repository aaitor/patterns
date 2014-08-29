package com.example.patterns.behavioral.strategy;

public interface Swim {

	String swim();
}

class ItSwim implements Swim {

	public String swim() {
		return "Yes, it's swimming";
	}
	
}

class CantSwim implements Swim {

	public String swim() {
		return "Nope, it can't swim";
	}
	
}