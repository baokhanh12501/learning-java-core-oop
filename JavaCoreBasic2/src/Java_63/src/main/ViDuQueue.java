package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSinhVien = new LinkedList<String>();
		
		danhSachSinhVien.offer("Khanh 1");
		danhSachSinhVien.offer("My 1");
		danhSachSinhVien.offer("Nguyen Xuan Minh");
		danhSachSinhVien.offer("Mai Ngoc Duy");
		
		while(true) {
			String ten = danhSachSinhVien.poll(); //=> lấy ra và xóa gtri
			if(ten==null) {
				break;
			}
			System.out.println(ten);
			
			
		}
		
	}
}
