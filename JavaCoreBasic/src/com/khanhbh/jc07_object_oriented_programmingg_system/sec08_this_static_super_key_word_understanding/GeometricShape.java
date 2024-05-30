package com.khanhbh.jc07_object_oriented_programmingg_system.sec08_this_static_super_key_word_understanding;

import java.sql.Date;

public class GeometricShape {
	// declare data fieldes : Khai báo các trường dữ liệu
	private String coler = "while";
	private boolean filled;
	private Date dateCreate;
	// define constructor : xác định hàm tạo

	public GeometricShape() {
		dateCreate = new Date(0);

	}

	public GeometricShape(String coler, boolean filled) {
		dateCreate = new Date(0);
		this.coler = coler;
		this.filled = filled;
	}
	// geter/setter

	public String getColer() {
		return coler;
	}

	public void setColer(String coler) {
		this.coler = coler;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
//other method
}
