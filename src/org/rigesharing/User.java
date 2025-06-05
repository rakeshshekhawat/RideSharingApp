package org.rigesharing;

abstract class User {
	protected String name;
	protected Location location;
	protected String email;
	
	public User(String name, Location location, String email) {
		this.name = name;
		this.location = location;
		this.email = email;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void notify(String msg);

}
