package org.rigesharing.designPattern.BehaviouralPatterns.ObserverPattern;

public class OberserverPattern {

	public static void main (String args[]) {
		Weather w= new Weather();
		DisplayDevice d1=new DisplayDevice();
		MobileDevice d2=new MobileDevice();
		
		
		w.add(d1);
		w.add(d2);
		w.setTemperature(28);
	}
}

