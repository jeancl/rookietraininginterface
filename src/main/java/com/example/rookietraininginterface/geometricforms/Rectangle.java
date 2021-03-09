package com.example.rookietraininginterface.geometricforms;

public class Rectangle implements GeometricForm {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public int getArea() {
        return length * width;
	}

	@Override
	public int getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String getGeometricFormName() {
		return "Rectangle";
	}
}
