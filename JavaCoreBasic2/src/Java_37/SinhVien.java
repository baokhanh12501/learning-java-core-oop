package Java_37;

import java.util.Objects;

public class SinhVien {
	private String maSinhVien, tenSinhVien;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop lop;

	public SinhVien(String maSinhVien, String tenSinhVien, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String layTenKhoa() {
		return this.lop.getTenKhoa();

	}

	public boolean kiemTraDat() {
		return this.diemTrungBinh >= 5;
	}
	public boolean kiemTraCungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh == svKhac.ngaySinh;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(ngaySinh, other.ngaySinh);
	}
}
