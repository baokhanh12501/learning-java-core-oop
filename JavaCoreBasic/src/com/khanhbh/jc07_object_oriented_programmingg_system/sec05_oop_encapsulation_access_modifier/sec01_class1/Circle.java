package com.khanhbh.jc07_object_oriented_programmingg_system.sec05_oop_encapsulation_access_modifier.sec01_class1;

import java.util.Date;

public class Circle {
	private double radius;
	String color = "While";
	protected Date dateCreate = new Date();

	public Circle() {

	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
}
