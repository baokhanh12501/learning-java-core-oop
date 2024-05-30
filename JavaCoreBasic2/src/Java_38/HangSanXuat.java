package Java_38;

public class HangSanXuat {
	private String tenHangSanXuat;
	private QuocGia tenQuocGia;

	public HangSanXuat(String tenHangSanXuat, QuocGia tenQuocGia) {
		super();
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public QuocGia getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(QuocGia tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

	public String layTenQuocGia() {
		// TODO Auto-generated method stub
		return this.tenQuocGia.getTenQuocGia();
	}

}
