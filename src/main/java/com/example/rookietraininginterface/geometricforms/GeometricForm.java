package com.example.rookietraininginterface.geometricforms;

public interface GeometricForm {
	
	public String getGeometricFormName();

	public int getArea();

	public int getPerimeter();
	
	public default void defaultMethodExample() {
		System.out.println("This is a default method in an interface only available after Java 8");
	}
}
