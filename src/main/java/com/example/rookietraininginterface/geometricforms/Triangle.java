package com.example.rookietraininginterface.geometricforms;

public class Triangle implements GeometricForm {

	private int base;
    private int height;
    private int sideA;
    private int sideB;
    private int sideC;
	
	public Triangle(int base, int height, int sideA, int sideB, int sideC) {
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public int getArea() {
		return (base * height) / 2;
	}

	@Override
	public int getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public String getGeometricFormName() {
		return "Triangle";
	}
}
