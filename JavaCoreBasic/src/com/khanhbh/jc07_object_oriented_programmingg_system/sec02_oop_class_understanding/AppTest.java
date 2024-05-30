package com.khanhbh.jc07_object_oriented_programmingg_system.sec02_oop_class_understanding;

public class AppTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel(10, 5);// tham chiếu
		System.out.println(hotel.checkAvaiableRoom());
	}
}
