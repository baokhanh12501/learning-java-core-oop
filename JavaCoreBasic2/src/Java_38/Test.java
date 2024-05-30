package Java_38;

public class Test {

	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 8, 2025);
		Ngay ngay2 = new Ngay(1, 3, 2025);
		Ngay ngay3 = new Ngay(17, 4, 2025);
		
		QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
		QuocGia quocGia2 = new QuocGia("USA", "Hoa Kỳ");
		QuocGia quocGia3 = new QuocGia("PL", "Ba Lan");
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Mac", quocGia1);
		HangSanXuat hangSanXuat2 = new HangSanXuat("Dell", quocGia3);
		HangSanXuat hangSanXuat3 = new HangSanXuat("HP", quocGia2);
		
		MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay2, 1500, 12);
		MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay1, 2000, 24);
		MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1000, 12);
		
		System.out.println("So Sanh gia: ");
		System.out.println("M1 và M2: "+mayTinh1.kiemTraGia(mayTinh2));
		System.out.println("So Sanh gia: ");
		System.out.println("M1 và M3: "+mayTinh1.kiemTraGia(mayTinh3));
		System.out.println("So Sanh gia: ");
		System.out.println("M2 và M3: "+mayTinh2.kiemTraGia(mayTinh3));
		
		System.out.println("Ten quoc gia: ");
		System.out.println("M1: "+mayTinh1.layTenQuocGia());
		System.out.println("Ten quoc gia: ");
		System.out.println("M2: "+mayTinh2.layTenQuocGia());
		System.out.println("Ten quoc gia: ");
		System.out.println("M3: "+mayTinh3.layTenQuocGia());
	}

}
