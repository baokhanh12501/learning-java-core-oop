package com.khanhbh.jc05_structure_programming.sec03_method;

import java.util.Scanner;

public class _05_Method_Recusion_Sum {
	public static void main(String[] args) {
		// sum = 1 + 1/2 + 1/3 + ... + 1/n với n nhập từ bàn phím => dùng đệ quy
		System.out.println("Enter a value for n: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("The total is: " + m(n));

		for (int i = 1; i <= n; i++) {
			System.out.printf("%2d%8.2f", i, m(i));
			System.out.println();
		}

	}

	private static double m(double n) {
		if (n == 1)
			return 1;
		else
			return 1 / n + m(n - 1);
	}

}
