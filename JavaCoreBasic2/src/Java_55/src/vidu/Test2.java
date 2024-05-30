package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Trinh Tra My", "62TH3", 3.99);
		
		SinhVien sv2 = new SinhVien(199, "Tran Khanh", "62TH3", 3);
		
		SinhVien sv3 = new SinhVien(150, "Mai Duy", "62TH3", 3.8);
		
		SinhVien sv4 = new SinhVien(150, "Xuan Minh", "62TH3", 3.8);
		
		SinhVien[] a_sv = new SinhVien[] {sv1 , sv2 ,sv3,sv4};
		
		System.out.println("ban dau: "+Arrays.toString(a_sv));
		
		//hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("ban dau: "+Arrays.toString(a_sv));
		
		//tìm kiếm trả về vị trí trong mảng
		
		System.out.println("tim kiem My: "+ Arrays.binarySearch(a_sv,sv1));
		
		System.out.println("tim kiem Minh: "+ Arrays.binarySearch(a_sv,sv4));
		
	}
}
