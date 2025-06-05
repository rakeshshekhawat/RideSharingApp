package org.rigesharing;

public class Passenger extends User{

	public Passenger(String name, Location location, String email) {
		super(name, location, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notify(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}

}
