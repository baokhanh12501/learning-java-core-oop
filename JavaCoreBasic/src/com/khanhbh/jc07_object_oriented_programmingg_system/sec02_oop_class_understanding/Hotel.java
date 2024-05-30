package com.khanhbh.jc07_object_oriented_programmingg_system.sec02_oop_class_understanding;

public class Hotel {
	// 1. khai báo các đặc tính của Hotel (thuộc tính/data fields)
	private String name;// tên của KS
	private String address;
	private int totalRoom;
	private int roomBooked;
	private boolean hasPool;

	public Hotel(int totalRoom, int roomBooked) {
		this.totalRoom = totalRoom;
		this.roomBooked = roomBooked;
	}

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
