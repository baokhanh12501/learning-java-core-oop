package com.khanhbh.jc07_object_oriented_programmingg_system.sec07_oop_polymorphism;

public class MainApp {

	public static void main(String[] args) {
		// Form1:
		displayDeomatric(new Circle(2.0, "red", true));
		displayDeomatric(new Circle(3.5, "black", false));

		// Form2:
		displayDeomatric(new Circle(4.5, "green", true));
		displayDeomatric(new Rectangle(30, 40, "White", false));
		// Form3:
		GeometricShape objPoly = new Rectangle(50, 80);
		displayDeomatric(objPoly);
	}

	public static void displayDeomatric(GeometricShape obj) {
		System.out.println("Create on " + obj.getDateCreate() + " and coler is " + obj.getColer());

	}
}
