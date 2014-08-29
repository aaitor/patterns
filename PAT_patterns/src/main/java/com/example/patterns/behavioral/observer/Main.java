package com.example.patterns.behavioral.observer;

public class Main {

	public static void main(String[] args) {

		StockGrabber stockGrabber= new StockGrabber();
		
		StockObserver observer1= new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(150.00);
		stockGrabber.setAAPLPrice(250.00);
		stockGrabber.setGOOGPrice(350.00);
		
		StockObserver observer2= new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(165.00);
		stockGrabber.setAAPLPrice(220.00);
		stockGrabber.setGOOGPrice(310.00);
		
		stockGrabber.unregister(observer1);
		
		Runnable getIBM= new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL= new GetTheStock(stockGrabber, 2, "AAPL", 220.40);
		Runnable getGOOG= new GetTheStock(stockGrabber, 2, "GOOG", 311.00);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}

}
