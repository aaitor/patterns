package com.example.patterns.behavioral.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber()	{
		observers= new ArrayList<Observer>();
	}
	
	public void register(Observer observer) {
		observers.add(observer);
	}

	public void unregister(Observer observer) {
		int observerIndex= observers.indexOf(observer);
		System.out.println("Observer " + observerIndex + 1 + " deleted");
		observers.remove(observerIndex);
	}

	public void notifyObserver() {
		for (Observer observer: observers)	{
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIBMPrice(double newPrice)	{
		ibmPrice= newPrice;
		notifyObserver();
	}

	public void setAAPLPrice(double newPrice)	{
		aaplPrice= newPrice;
		notifyObserver();
	}
	
	public void setGOOGPrice(double newPrice)	{
		googPrice= newPrice;
		notifyObserver();
	}	
	
}
