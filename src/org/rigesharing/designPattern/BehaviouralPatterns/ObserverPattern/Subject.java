package org.rigesharing.designPattern.BehaviouralPatterns.ObserverPattern;

public interface Subject {
	public void add(Oberserver oberserver);
	public void remove(Oberserver oberserver);
	public void inform();
	

}
