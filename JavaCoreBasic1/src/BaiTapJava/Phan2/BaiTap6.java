package BaiTapJava.Phan2;

import java.util.Scanner;

public class BaiTap6 {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		System.out.println("Nhập vào số nguyên N: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				sum += i;
			System.out.println(sum);
		}
	}
}
