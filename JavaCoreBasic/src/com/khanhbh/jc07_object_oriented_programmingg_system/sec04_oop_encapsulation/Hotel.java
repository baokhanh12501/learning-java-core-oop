package com.khanhbh.jc07_object_oriented_programmingg_system.sec04_oop_encapsulation;

public class Hotel {
	// Tính đóng gói?

	// 1. khai báo các đặc tính của Hotel (thuộc tính/data fields)
	private String name;// tên của KS
	private String address;
	private int totalRoom;
	private int roomBooked;
	private boolean hasPool;

	// định nghĩa constructor
	public Hotel(String pName, String pAddress, int pTotalRoom, int pRoomBooked, boolean pHasPol) {
		name = pName;
		address = pAddress;
		totalRoom = pTotalRoom;
		roomBooked = pRoomBooked;
		hasPool = pHasPol;
		{
		}

	}

	public Hotel() {

	}

	// 2.Kiểm tra xem KS còn bao nhiêu phòng trống(hành động => phương thức
	// (method)
	public int checkAvaiableRoom() {
		return totalRoom - roomBooked;
	}

	public String getInfoHotel() {
		return "Hotel " + name + " has " + totalRoom + " and " + roomBooked + " boked";
	}

	// seter/geter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	public int getRoomBooked() {
		return roomBooked;
	}

	public void setRoomBooked(int roomBooked) {
		this.roomBooked = roomBooked;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}

}
