package org.rigesharing.designPattern.BehaviouralPatterns.ObserverPattern;

public class DisplayDevice  implements Oberserver{

	
	@Override
	public void updateMethod(float temp) {
		System.out.println("Displaying the temperature in common device :"+temp);
	}

}
