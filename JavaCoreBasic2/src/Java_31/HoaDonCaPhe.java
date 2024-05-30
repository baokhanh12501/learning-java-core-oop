package Java_31;

public class HoaDonCaPhe {
	private String tenCaPhe;
	private double giaTien1kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenCaPhe = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}

	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuong(double kl) {

		return this.khoiLuong > kl;
	}

	public boolean kiemTraTongTien() {
		return this.tinhTongTien() > 500;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500) {
			return (x / 100) * this.tinhTongTien();
		}else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}

}
