package org.rigesharing.designPattern.BehaviouralPatterns.StrategyPattern;

public class StrategyPattern {

	public static void main(String args[]) {
		Service service=new Service();
		service.setStrategy(new CreditCard());
		/*
		 * service.setStrategy(new DebitCard()); service.setStrategy(new Online())
		 */;
		service.pay();
	}
}
