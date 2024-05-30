package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ViDuDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSinhVien = new ArrayDeque<String>();
		
		danhSachSinhVien.offer("Khanh 1");
		danhSachSinhVien.offer("My 1");
		danhSachSinhVien.offer("Nguyen Xuan Minh");
		danhSachSinhVien.offer("Mai Ngoc Duy");
		danhSachSinhVien.offerLast("Khanh 2");
		danhSachSinhVien.offerFirst("My 0");
		
		while(true) {
			String ten = danhSachSinhVien.poll(); //=> lấy ra và xóa gtri
			if(ten==null) {
				break;
			}
			System.out.println(ten);
			
			
		}
		
	}
}
