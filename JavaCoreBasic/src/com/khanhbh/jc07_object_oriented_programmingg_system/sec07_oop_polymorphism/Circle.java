package com.khanhbh.jc07_object_oriented_programmingg_system.sec07_oop_polymorphism;

public class Circle extends GeometricShape {
	private double radius;

	public Circle() {

	}

	public Circle(double pRadius) {
		radius = pRadius;

	}

	public Circle(double pRadius, String pColer, boolean pFilled) {
		radius = pRadius;
		setColer(pColer);
		setFilled(pFilled);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// tinh diện tính
	public double getArea() {
		return Math.PI * radius * radius;
	}

	// tính chu vi
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void printCicle() {
		System.out.println("The circle is creted " + getDateCreate() + " and the radius is " + radius);
	}
}
