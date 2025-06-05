package org.rigesharing;

public class Location {
	
	private double longitude;
	private double latitude;
	
	public Location(double longitude, double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	
public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}


public double calcDistance(Location two) {
	double dx = this.getLatitude()-two.getLatitude();
	double dy = this.getLongitude()-two.getLongitude();
	return Math.sqrt(dx*dx+dy*dy);
}
	
	

}
