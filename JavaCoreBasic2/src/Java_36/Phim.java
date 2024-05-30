package Java_36;

public class Phim {
	private String tenPhim;
	HangSanXuat hangSanXuat;
	private int namSanXuat;
	private double giaVe;
	Ngay ngayChieu;
	public Phim(String tenPhim, HangSanXuat hangSanXuat, int namSanXuat, double giaVe, Ngay ngayChieu) {
		super();
		this.tenPhim = tenPhim;
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean kiemTraGiaVeReHon(Phim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
	}
	
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public double giaVeSauGiamGia(double x) {
		return this.giaVe*(1-x/100);
	}
	
}
