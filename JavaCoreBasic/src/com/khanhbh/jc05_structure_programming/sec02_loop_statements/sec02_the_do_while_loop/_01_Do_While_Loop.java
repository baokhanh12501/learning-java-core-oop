package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec02_the_do_while_loop;

import java.util.Scanner;

public class _01_Do_While_Loop {
	public static void main(String[] args) {
		// Nhập từ bàn phím cho tới khi = 0 => sum

		long sum = 0;
		int data;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Nhập số (thoát khi nhập 0)");
			data = sc.nextInt();
			sum += data;

		} while (data != 0);
		System.out.println("The total is:" + sum);
	}
}
