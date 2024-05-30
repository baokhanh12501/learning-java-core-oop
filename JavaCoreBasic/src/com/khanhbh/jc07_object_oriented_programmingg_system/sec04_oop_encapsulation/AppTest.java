package com.khanhbh.jc07_object_oriented_programmingg_system.sec04_oop_encapsulation;

public class AppTest {
	public static void main(String[] args) {
		Hotel pakson = new Hotel("Pakson", "So 1 , Hung Vuong Ba Dinh , Ha Noi", 100, 20, true);// tham chiếu
		// System.out.println(pakson.getInfoHotel());
		Hotel media = new Hotel("Media", "So 2 , Hung Vuong Ba Dinh , Ha Noi", 100, 200, true);// tham chiếu
		// System.out.println(media.getInfoHotel());
		Hotel paradise = new Hotel();
		paradise.setName("Paradise");
		paradise.setAddress("So 1,ly tu trong , hcm");
		paradise.setTotalRoom(100);
		paradise.setRoomBooked(30);
		paradise.setHasPool(true);
		System.out.println(paradise.getInfoHotel());
		System.out.println(paradise.getName());
	}
}
