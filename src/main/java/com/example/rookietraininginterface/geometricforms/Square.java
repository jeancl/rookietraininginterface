package com.example.rookietraininginterface.geometricforms;

public class Square implements GeometricForm {

	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public int getArea() {
        return side * side;
	}

	@Override
	public int getPerimeter() {
		return side * 4;
	}

	@Override
	public String getGeometricFormName() {
		return "Square";
	}

}
