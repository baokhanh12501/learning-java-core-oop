package Java_45;

public class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang1", "Việt Nam");
		HangSanXuat h2 = new HangSanXuat("Hang2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hang3", "Japan");
		
		MayBay p1 = new MayBay("Xăng", h3);
		PhuongTienDiChuyen p2 = new XeOto("Dầu", h3);
		PhuongTienDiChuyen p3 = new XeDap(h3);
		
		
		System.out.println("lay hang san xuat");
		System.out.println("p1"+p1.layTenHangSanXuat());
		
		System.out.println("Bắt đầu: ");
		p1.khoiDong();
		
		System.out.println("lay van toc:");
		System.out.println("p1: "+p1.layVanToc());
		System.out.println("p2: "+p2.layVanToc());
		System.out.println("p3: "+p3.layVanToc());
		
		System.out.println("Cất cánh: ");
		p1.catCanh();
		System.out.println("Trần Bảo Khánh");
	}
}
