package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<>();
		
//		stackChuoi.push("giatri"); => đưa giá trị vào 
		
//		stackChuoi.pop(); => lấy giá trị ra và xóa khỏi stack
		
//		stackChuoi.peek(); => lấy giá trị ra nhưng k xóa khỏi stack
		
//		stackChuoi.clear(); => xóa toàn bộ giá trị trong stack 
		
//		stackChuoi.contains("giatri"); => xác định giá trị có tồn tại trong stack không
		
//		stackChuoi.size(); => độ lớn stack
		
		//Ví dụ đảo ngược chuỗi
		
		System.out.println("Nhập vào chuỗi");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			stackChuoi.push(s.charAt(i)+" ");
		}
		System.out.println("Chuỗi đảo ngược");

		for(int i=0;i<s.length();i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		// Ví dụ chuyển từ hệ thập phân sang nhị phân
		
		Stack<String> stackSoDu = new Stack<String>();
		
		System.out.println("Nhập 1 số nguyên dương từ bàn phím");
		int x = sc.nextInt();
		
		while (x>0) {
			int soDu  = x%2;
			stackSoDu.push(soDu+"");
			x = x/2;
		}
		System.out.println("Số nhị phân là: ");
		int n =stackSoDu.size();
		for(int i = 0;i<n; i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
