package org.rigesharing;

abstract class Vehicle {

	String numberPlate;
	public Vehicle(String numberPlate) {
		super();
		this.numberPlate = numberPlate;
	}
	public abstract double getFarePerKm();
}
