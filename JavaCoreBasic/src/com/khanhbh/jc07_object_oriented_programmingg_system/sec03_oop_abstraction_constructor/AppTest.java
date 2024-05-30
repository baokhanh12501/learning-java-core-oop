package com.khanhbh.jc07_object_oriented_programmingg_system.sec03_oop_abstraction_constructor;

public class AppTest {
	public static void main(String[] args) {
		Hotel pakson = new Hotel("Pakson", "So 1 , Hung Vuong Ba Dinh , Ha Noi", 100, 20, true);// tham chiếu
		System.out.println(pakson.getInfoHotel());
		Hotel media = new Hotel("Media", "So 2 , Hung Vuong Ba Dinh , Ha Noi", 100, 200, true);// tham chiếu
		System.out.println(media.getInfoHotel());
		// instance of

	}
}
