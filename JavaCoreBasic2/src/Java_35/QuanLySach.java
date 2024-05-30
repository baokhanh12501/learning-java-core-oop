package Java_35;

public class QuanLySach {
	private String tenSach;
	private TacGia tenTacGia;
	private double giaBan;
	private int namXuatBan;
	public QuanLySach(String tenSach, TacGia tenTacGia, double giaBan, int namXuatBan) {
		super();
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public TacGia getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(TacGia tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	public boolean kiemTraNamXuatBan(QuanLySach sachKhac) {
		return this.namXuatBan == sachKhac.namXuatBan;
	}
	public double giaSauKhiGia(double x) {	
		return (1-x/100)*this.giaBan;
	}
	
}
