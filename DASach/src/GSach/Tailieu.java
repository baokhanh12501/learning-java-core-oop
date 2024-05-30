package GSach;

public abstract class Tailieu {
	private String maSach,tenSach;

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public Tailieu() {
		
	}
	public Tailieu(String maSach, String tenSach) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
	}
	public abstract double ThanhTien();
	
}
