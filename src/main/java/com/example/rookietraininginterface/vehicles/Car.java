package com.example.rookietraininginterface.vehicles;

public class Car implements Vehicle, Engine {

	private String name;
	private String engineModel;
	
	public Car(String name, String engineModel) {
		this.name = name;
		this.engineModel = engineModel;
	}

	@Override
	public String getEngineModel() {
		return engineModel;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Vehicle Name: " + getName() + ", Vehicle Engine: " + getEngineModel();
	}
}
