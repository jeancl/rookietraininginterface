package com.example.rookietraininginterface.geometricforms;

public class MainGeometricForms {

	public static void main(String[] args) {
		Square square = new Square(2);
		Rectangle rectangle = new Rectangle(3, 6);
		Triangle triangle = new Triangle(6, 9, 3, 5, 3);
		
		//calling default method from interface example
		square.defaultMethodExample();
		
		//calling generic method using GeometricForms
		displayAreaAndPerimeter(square);
		displayAreaAndPerimeter(rectangle);
		displayAreaAndPerimeter(triangle);
	}

	public static void displayAreaAndPerimeter(GeometricForm geometricForm) {
		System.out.println(geometricForm.getGeometricFormName() + " area = " + geometricForm.getArea()
				+ ", perimeter = " + geometricForm.getPerimeter());
	}
}
