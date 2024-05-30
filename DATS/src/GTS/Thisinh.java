package GTS;

public abstract class Thisinh {
	private int soBD;
	private double tongDiem;
	private String hoTen,gioiTinh,nganhHoc;
	public int getSoBD() {
		return soBD;
	}
	public void setSoBD(int soBD) {
		this.soBD = soBD;
	}
	public double getTongDiem() {
		return tongDiem;
	}
	public void setTongDiem(double tongDiem) {
		this.tongDiem = tongDiem;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}
	public Thisinh() {
		
	}
	public Thisinh(int soBD, double tongDiem, String hoTen, String gioiTinh, String nganhHoc) {
		super();
		this.soBD = soBD;
		this.tongDiem = tongDiem;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.nganhHoc = nganhHoc;
	}
	public void HocBong() {
		if (tongDiem>29)
			System.out.println("HB");
		else
			System.out.println("");
	}
}
