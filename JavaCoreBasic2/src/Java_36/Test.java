package Java_36;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(28, 4, 2023);
		
		Ngay ngay2 = new Ngay(21, 7, 2026);
		
		Ngay ngay3 = new Ngay(14, 4, 2022);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Anime", "Japan");
		
		HangSanXuat hangSanXuat2 = new HangSanXuat("Moive attack", "US");
		
		HangSanXuat hangSanXuat3 = new HangSanXuat("Ghost", "Thailand");
		
		Phim phim1 = new Phim("Kimetsu no yaiba", hangSanXuat1, 2022, 65000, ngay3);
		
		Phim phim2 = new Phim("Running man", hangSanXuat2, 2026, 100000, ngay1);
		
		Phim phim3 = new Phim("Kham pha luc dia", hangSanXuat3, 2028, 75000, ngay2);
		
		System.out.println("So sanh phim 1 va phim 2: "+phim1.kiemTraGiaVeReHon(phim2));
		
		System.out.println("So sanh phim 2 va phim 3: "+phim2.kiemTraGiaVeReHon(phim3));
		
		System.out.println("So sanh phim 1 va phim 3: "+phim1.kiemTraGiaVeReHon(phim3));
		
		System.out.println("Ten hang san xuat cua phim 1: "+phim3.layTenHangSanXuat());
		
		System.out.println("Gia ve phim 1 sau khi giam gia: "+phim1.giaVeSauGiamGia(10));
	}
}
