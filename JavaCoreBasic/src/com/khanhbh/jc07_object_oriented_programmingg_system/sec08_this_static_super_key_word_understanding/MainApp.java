package com.khanhbh.jc07_object_oriented_programmingg_system.sec08_this_static_super_key_word_understanding;

public class MainApp {

	public static void main(String[] args) {
		Circle cricle1 = new Circle();
		Circle cricle2 = new Circle();

		System.out.println("So luong doi tuong 1 là: " + cricle1.getNumberOjobects());
		System.out.println("So luong doi tuong 2 là: " + cricle2.getNumberOjobects());

	}

	public static void displayDeomatric(GeometricShape obj) {
		System.out.println("Create on " + obj.getDateCreate() + " and coler is " + obj.getColer());

	}
}
