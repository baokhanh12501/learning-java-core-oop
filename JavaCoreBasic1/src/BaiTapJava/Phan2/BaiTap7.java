package BaiTapJava.Phan2;

import java.util.Scanner;

public class BaiTap7 {
	public static void main(String[] args) {
		int n;
		System.out.print("Nhập vào số nguyên N: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= 20; i++) {
			System.out.println("Tổng của n với phần tử thứ " + i + " là: " + n * i);
		}
	}
}
