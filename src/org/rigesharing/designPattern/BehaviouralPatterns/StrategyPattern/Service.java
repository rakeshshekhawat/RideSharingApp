package org.rigesharing.designPattern.BehaviouralPatterns.StrategyPattern;

public class Service {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void pay() {
		strategy.process();
	}
}

class CreditCard implements Strategy {

	@Override
	public void process() {

		System.out.println("Credit Card Payment");
	}
}

class Online implements Strategy {

	@Override
	public void process() {
		System.out.println("Online Payment");

	}

}

class DebitCard implements Strategy {

	@Override
	public void process() {
		System.out.println("Debit Card Payment");
	}
}