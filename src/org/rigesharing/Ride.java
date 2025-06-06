package org.rigesharing;

enum RideStatus {
	Scheduled, Ongoing, Completed
}

public class Ride {

	private Passenger passenger;
	private Driver driver;
	private double distance;
	private FareStrategy fareStrategy;
	private double fare;
	private RideStatus status;

	public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy,
			RideStatus status) {
		super();
		this.passenger = passenger;
		this.driver = driver;
		this.distance = distance;
		this.fareStrategy = fareStrategy;
		
	}
	public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy) {
		super();
		this.passenger = passenger;
		this.driver = driver;
		this.distance = distance;
		this.fareStrategy = fareStrategy;
		
	}
	

	



	public void calcFare() {
		this.fare= fareStrategy.calcFare(driver.getVehicle(), distance);
	}

	public void updateStatus(RideStatus status) {
		this.status = status;
		notifyUsers(status);
	}

	private void notifyUsers(RideStatus status) {
		passenger.notify("Your Ride is Rs" + status);
		driver.notify("Ride Status " + status);
	}

	public double getFare() {
		return fare;
	}
}
