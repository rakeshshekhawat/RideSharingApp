package org.rigesharing;

public class Client {

	public static void main(String[] args) {
		Location l1 = new Location(12.9716, 77.5946);
		Location l2 = new Location(12.9352, 77.6245);
		Location l3 = new Location(13.0352, 77.6175);
		
		Vehicle Car= new Car("M12-6H-8474");
		Vehicle bike = new Bike("MH12-SM-1799");
		
		Driver d1 = new Driver("Test1", l2, "t1@gmail.com", bike);
		Driver d2 = new Driver("Test2Car", l3, "t1@gmail.com", Car);
		
		Passenger p1 = new Passenger("Rakesh", l1, "client@gmail.com");
		
		
		RideMatchingSystem matchingSystem = new RideMatchingSystem();
		matchingSystem.addDriver(d1);
		matchingSystem.addDriver(d2);
		matchingSystem.requestRide(p1, 10, new StandardFareStrategy());
	}
	
}
