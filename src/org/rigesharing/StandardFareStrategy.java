package org.rigesharing;

public class StandardFareStrategy implements FareStrategy{

	@Override
	public double calcFare(Vehicle vehicle, double distance) {
		// TODO Auto-generated method stub
		return vehicle.getFarePerKm()*distance;
	}

}
