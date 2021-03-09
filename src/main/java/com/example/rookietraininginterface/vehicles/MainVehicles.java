package com.example.rookietraininginterface.vehicles;

import java.util.ArrayList;
import java.util.List;

public class MainVehicles {

	public static void main(String[] args) {
		Vehicle car1 = new Car("Honda Civic", "2.0");
		Vehicle car2 = new Car("FIAT Uno", "1.0");
		Vehicle bicycle = new Bicycle("Bicycle Caloi");
		
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(car1);
		vehicleList.add(car2);
		vehicleList.add(bicycle);
		
		displayVehicles(vehicleList);
	}

	public static void displayVehicles(List<Vehicle> vehicleList) {
		vehicleList.forEach(System.out::println);
	}
}
