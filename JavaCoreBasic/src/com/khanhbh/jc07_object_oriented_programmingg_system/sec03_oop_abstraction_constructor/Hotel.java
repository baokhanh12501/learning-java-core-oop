package com.khanhbh.jc07_object_oriented_programmingg_system.sec03_oop_abstraction_constructor;

public class Hotel {
	// Tính trừu tượng trong oop?

	// 1. khai báo các đặc tính của Hotel (thuộc tính/data fields)
	private String name;// tên của KS
	private String address;
	private int totalRoom;
	private int roomBooked;
	private boolean hasPool;

	// định nghĩa constructor
//	public Hotel(String pName, String pAddress, int pTotalRoom, int pRoomBooked, boolean pHasPol) {
//		name = pName;
//		address = pAddress;
//		totalRoom = pTotalRoom;
//		roomBooked = pRoomBooked;
//		hasPool = pHasPol;
//		{
//		}

//	}

	// 2.Kiểm tra xem KS còn bao nhiêu phòng trống(hành động => phương thức
	// (method)
	public int checkAvaiableRoom() {
		return totalRoom - roomBooked;
	}

	public Hotel(String name, String address, int totalRoom, int roomBooked, boolean hasPool) {
		super();
		this.name = name;
		this.address = address;
		this.totalRoom = totalRoom;
		this.roomBooked = roomBooked;
		this.hasPool = hasPool;
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
