package com.khanhbh.jc07_object_oriented_programmingg_system.sec01_oop_object_understanding;

public class Hotel {
	// 1. khai báo các đặc tính của Hotel (thuộc tính/data fields)
	private String name = "Packson";// tên của KS
	private String address = "135, Giang Vo , Ba Dinh , Ha Noi";
	private int totalRoom = 200;
	private int roomBooked = 120;
	private boolean hasPool = true;

	// 2.Kiểm tra xem KS còn bao nhiêu phòng trống(hành động => phương thức
	// (method)
	public int checkAvaiableRoom() {
		return totalRoom - roomBooked;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public int getRoomBooked() {
		return roomBooked;
	}

	public String getInfoHotel() {
		return "Hotel " + name + " has " + totalRoom + " and " + roomBooked + " boked";
	}

}
