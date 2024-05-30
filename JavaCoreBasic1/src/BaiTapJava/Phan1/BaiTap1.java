package BaiTapJava.Phan1;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a:");
		a = sc.nextInt();

		if (a > 0) {
			System.out.println("Đây là số nguyên");
		} else {
			System.out.println("Đây là số nguyên âm");
		}

	}

}
