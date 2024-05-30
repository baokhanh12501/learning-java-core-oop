package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Trinh Tra My", "62TH3", 3.99);
		
		SinhVien sv2 = new SinhVien(199, "Tran Khanh", "62TH3", 3);
		
		SinhVien sv3 = new SinhVien(150, "Xuan Duy", "62TH3", 3.8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
		
		
		
	}
}
