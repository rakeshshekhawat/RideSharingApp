package org.rigesharing.designPattern.BehaviouralPatterns.ObserverPattern;

public class MobileDevice implements Oberserver {

	@Override
	public void updateMethod(float temp) {
		System.out.println("Displaying the temperature in mobile device :"+temp);
	}

}
