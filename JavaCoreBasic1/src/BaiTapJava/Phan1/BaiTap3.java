package BaiTapJava.Phan1;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 3 cạch a,b,c của tam ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		if (a * a + b * b == c * c && a * a + c * c == b * b && b * b + c * c == a * a) {
			System.out.println("Tam giác này là tam giác vuông");

		} else {
			System.out.println("Tam giác này không là tam giác vuông");
		}
	}
}
