package org.rigesharing;

import java.util.ArrayList;

public class RideMatchingSystem {
	private ArrayList<Driver> availableDrivers= new ArrayList<>();
	public void addDriver(Driver driver) {
		availableDrivers.add(driver);
	}

	public void requestRide(Passenger passenger,double distance) {
		if(availableDrivers.isEmpty()) {
			passenger.notify("No Drivers are available");
			return;
		}
		Driver nearestDriver = findNearestDriver(passenger.location);
		passenger.notify("Ride Scheduled Successfully");
		return ;
	}
	

	private Driver findNearestDriver(Location passengerLocation) {
		
		Driver assignedDriver = null;
		double minDist =Double.MAX_VALUE;
		for (Driver driver : availableDrivers) {
			double distance = driver.getLocation().calcDistance(passengerLocation);
			if(distance<minDist) {
				distance=distance;
				assignedDriver = driver;
				
			}
			return driver;
		}
		return null;
	}
}
