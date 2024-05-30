package com.khanhbh.jc07_object_oriented_programmingg_system.sec07_oop_polymorphism;

public class Rectangle extends GeometricShape {
	private double height;
	private double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public Rectangle(double height, double width, String pColer, boolean pFilled) {
		this.height = height;
		this.width = width;
		setColer(pColer);
		setFilled(pFilled);

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	// other method

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}
}
