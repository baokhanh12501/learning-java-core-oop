package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityCQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSinhVien = new PriorityQueue<String>();
		
		danhSachSinhVien.offer("Khanh 1");
		
		danhSachSinhVien.offer("Nguyen Xuan Minh 2");
		
		danhSachSinhVien.offer("Mai Ngoc Duy 1");
		
		danhSachSinhVien.offer("My 1");
		
		while(true) {
			String ten = danhSachSinhVien.poll(); //=> lấy ra và xóa gtri
			if(ten==null) {
				break;
			}
			System.out.println(ten);
			
			
		}
		
	}
}
