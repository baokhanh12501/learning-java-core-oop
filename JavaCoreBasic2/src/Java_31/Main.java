package Java_31;

public class Main {

	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Ca Phe Trung Nguyen", 100, 1.5);
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Ca Phe Trung Nguyen", 100, 5.5);
		System.out.println("Tong Tien: " + hd.tinhTongTien());
		
		System.out.println("Tong Tien: " + hd1.tinhTongTien());
		
		System.out.println("Kiem tra khoi luong lon hon 2kg: " + hd.kiemTraKhoiLuong(2));
		
		System.out.println("Kiem tra khoi luong lon hon 1kg: " + hd.kiemTraKhoiLuong(1));
		
		System.out.println("Kiem tra tong tien >500 : " + hd.kiemTraTongTien());
		
		System.out.println("Giam gia cua HD: "+hd.giamGia(10));
		
		System.out.println("Giam gia cua HD: "+hd1.giamGia(10));
		
		System.out.println("Sau giam gia cua HD: "+hd.giaSauKhiGiam(10));
		
		System.out.println("Sau giam gia cua HD: "+hd1.giaSauKhiGiam(10));
	}

}
