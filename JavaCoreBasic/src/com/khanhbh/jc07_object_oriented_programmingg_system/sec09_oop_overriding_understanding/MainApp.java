package com.khanhbh.jc07_object_oriented_programmingg_system.sec09_oop_overriding_understanding;

public class MainApp {

	public static void main(String[] args) {
		GeometricShape geomatricShape = new Circle(3.5, "Red", true);
		System.out.println("Dien tich cua hinh tron: " + geomatricShape.getArea());
		System.out.println("Chu vi cua hinh tron: " + geomatricShape.getPerimeter());

		GeometricShape obj = new GeometricShape();
		System.out.println("Dien tich cua hinh tron: " + obj.getArea());
		System.out.println("Chu vi cua hinh tron: " + obj.getPerimeter());

	}

	public static void displayDeomatric(GeometricShape obj) {
		System.out.println("Create on " + obj.getDateCreate() + " and coler is " + obj.getColer());

	}
}
