package com.example.rookietraininginterface.vehicles;

public class Bicycle implements Vehicle {

	private String name;
	
	public Bicycle(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Vehicle Name: " + getName();
	}
}
