package Java_37;

public class Test {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(12, 5, 2001);
		NgaySinh ngay2 = new NgaySinh(13, 9, 2001);
		NgaySinh ngay3 = new NgaySinh(16, 9, 2004);
		NgaySinh ngay4 = new NgaySinh(12, 5, 2001);
		
		Lop lop1 = new Lop("62TH3", "CNTT");
		Lop lop2 = new Lop("62KT", "QTKD");
		Lop lop3 = new Lop("62PM3", "PM");
		Lop lop4 = new Lop("62TH2", "CNTT");
		
		SinhVien sinhVien1 = new SinhVien("2051063823", "Trần Bảo Khánh", ngay1, 9.0, lop1);
		SinhVien sinhVien2 = new SinhVien("2051066723", "Nguyễn Xuân Minh", ngay3, 3.9, lop3);
		SinhVien sinhVien3 = new SinhVien("2051063823", "Cao Bá Lợi", ngay3, 3.9, lop4);
		SinhVien sinhVien4 = new SinhVien("2051063123", "Mai Ngọc Duy", ngay4, 5.0, lop2);
		
		System.out.println("Ten Khoa SV1: "+sinhVien1.layTenKhoa());
		System.out.println("Ten Khoa SV2: "+sinhVien2.layTenKhoa());
		System.out.println("Ten Khoa SV3: "+sinhVien3.layTenKhoa());
		System.out.println("Ten Khoa SV4: "+sinhVien4.layTenKhoa());
		
		System.out.println("Sinh vien 1: "+sinhVien1.kiemTraDat());
		System.out.println("Sinh vien 2: "+sinhVien2.kiemTraDat());
		System.out.println("Sinh vien 3: "+sinhVien3.kiemTraDat());
		System.out.println("Sinh vien 4: "+sinhVien4.kiemTraDat());
		
		System.out.println("SV1 va SV2 "+sinhVien1.kiemTraCungNgaySinh(sinhVien2));
		System.out.println("SV1 va SV3 "+sinhVien1.kiemTraCungNgaySinh(sinhVien3));
		System.out.println("SV1 va SV4 "+sinhVien1.kiemTraCungNgaySinh(sinhVien4));
		System.out.println("SV2 va SV3 "+sinhVien2.kiemTraCungNgaySinh(sinhVien3));
		System.out.println("SV2 va SV3 "+sinhVien2.kiemTraCungNgaySinh(sinhVien4));
		System.out.println("SV3 va SV4 "+sinhVien3.kiemTraCungNgaySinh(sinhVien4));
	}
}
