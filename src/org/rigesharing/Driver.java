package org.rigesharing;

public class Driver extends User {

	private Vehicle vehicle;
	
	public Driver(String name, Location location, String email,Vehicle vehicle) {
		super(name, location, email);
		this.vehicle=vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
		
	@Override
	public void notify(String msg) {
		// TODO Auto-generated method stub
		
	}

}
