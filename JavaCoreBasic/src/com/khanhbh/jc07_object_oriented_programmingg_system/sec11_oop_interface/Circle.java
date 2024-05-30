package com.khanhbh.jc07_object_oriented_programmingg_system.sec11_oop_interface;

public class Circle implements IGeomatric {
	private double radius;
	static int numberOjobects = 0;// lưu số lần tạo đối tượng

	public Circle() {
		this(1.0);
		numberOjobects++;
	}

	public Circle(double radius) {
		this.radius = radius;
		numberOjobects++;

	}

	public Circle(double radius, String coler, boolean filled) {
		this.radius = radius;
		numberOjobects++;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// tinh diện tính
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	// tính chu vi
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public static int getNumberOjobects() {
		return numberOjobects;
	}

//	public void printCicle() {
//		System.out.println("The circle is creted " + this.getDateCreate() + " and the radius is " + this.radius);
//	}
}
