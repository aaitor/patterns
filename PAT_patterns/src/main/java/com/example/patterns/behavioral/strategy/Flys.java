package com.example.patterns.behavioral.strategy;

public interface Flys {

	String fly();
}

class ItFlys implements Flys {

	public String fly() {
		return "Yes, it's flying";
	}
	
}

class CantFly implements Flys {

	public String fly() {
		return "Nope, it can't fly";
	}
	
}