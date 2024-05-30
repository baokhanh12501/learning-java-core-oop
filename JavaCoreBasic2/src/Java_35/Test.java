package Java_35;

public class Test {

	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(12, 5, 2001);
		Ngay ngay2 = new Ngay(13, 9, 2001);
		Ngay ngay3 = new Ngay(12, 5, 2001);
		
		TacGia tacGia1 = new TacGia("Trần Bảo Khánh", ngay1);
		TacGia tacGia2 = new TacGia("Trịnh Trà My", ngay2);
		TacGia tacGia3 = new TacGia("Trần Khánh", ngay1);
			
		QuanLySach sach1 = new QuanLySach("Học học nữa học mãi", tacGia3, 15000, 2028);
		
		QuanLySach sach2 = new QuanLySach("C++", tacGia1, 20000, 2021);
		
		QuanLySach sach3 = new QuanLySach("Java", tacGia2, 30000, 2021);
		
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So Sanh sach1 va sach2: "+sach1.kiemTraNamXuatBan(sach2));
		
		System.out.println("So Sanh sach2 va sach3: "+sach2.kiemTraNamXuatBan(sach3));
		
		System.out.println("So Sanh sach1 va sach3: "+sach1.kiemTraNamXuatBan(sach3));
		
		System.out.println("Gia sach1 giam 10%: "+sach1.giaSauKhiGia(10));
	}

}
