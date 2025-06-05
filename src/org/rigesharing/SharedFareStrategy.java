package org.rigesharing;

public class SharedFareStrategy implements FareStrategy{

	@Override
	public double calcFare(Vehicle vehicle, double distance) {
		// TODO Auto-generated method stub
		return vehicle.getFarePerKm()*distance*0.5;
	}

}
