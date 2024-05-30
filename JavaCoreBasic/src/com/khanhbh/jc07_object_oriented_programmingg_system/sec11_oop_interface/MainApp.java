package com.khanhbh.jc07_object_oriented_programmingg_system.sec11_oop_interface;

public class MainApp {

	public static void main(String[] args) {
		IGeomatric geomatricShape = new Circle(3.5, "Red", true);
		System.out.println("Dien tich cua hinh tron: " + geomatricShape.getArea());
		System.out.println("Chu vi cua hinh tron: " + geomatricShape.getPerimeter());

//		GeometricShape obj = new GeometricShape();
//		System.out.println("Dien tich cua hinh tron: " + obj.getArea());
//		System.out.println("Chu vi cua hinh tron: " + obj.getPerimeter());

	}

//	public static void displayDeomatric(IGeomatric obj) {
//		System.out.println("Create on " + obj.getDateCreate() + " and coler is " + obj.getColer());
//
//	}
}
