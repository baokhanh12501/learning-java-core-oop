package GSach;

public class Sach extends Tailieu{
	 int namXB;
	 double giaBan;
	
	public Sach() {
	}
	public Sach(String maSach, String tenSach, int namXB, double giaBan) {
		super(maSach, tenSach);
		this.namXB = namXB;
		this.giaBan = giaBan;
	}
	public int getNamXB() {
		return namXB;
	}
	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double Thanhtien() {
		double temp ;
		if(namXB < 2015) temp = giaBan*0.85;
		else temp = giaBan*0.95;
		return temp;
	}
	@Override
	public double ThanhTien() {
		// TODO Auto-generated method stub
		return 0;
	}

}
