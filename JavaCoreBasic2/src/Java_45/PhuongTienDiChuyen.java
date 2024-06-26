package Java_45;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}

	public void khoiDong() {
		System.out.println("Bat dau...");
	}

	public void tangToc() {
		System.out.println("Tang toc");
	}

	public void tatMay() {
		System.out.println("Dung lai");
	}
	public abstract double layVanToc();
}
