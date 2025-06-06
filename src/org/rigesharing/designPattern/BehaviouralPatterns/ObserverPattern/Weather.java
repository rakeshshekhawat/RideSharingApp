package org.rigesharing.designPattern.BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;

public class Weather implements Subject{
	
	private float temperature;
	private ArrayList<Oberserver> obeList= new ArrayList<>() ;
	@Override
	public void add(Oberserver oberserver) {
		obeList.add(oberserver);
		
	}

	@Override
	public void remove(Oberserver oberserver) {
		obeList.remove(oberserver);
	}

	@Override
	public void inform() {
		for (Oberserver oberserver : obeList) {
			oberserver.updateMethod(temperature);
		}
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		inform();
	}
	
	

}
