package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec01_the_while_loop;

import java.util.Scanner;

public class _03_TheWhileLoop {
	public static void main(String[] args) {
		// Nhập vào số tự nhiên cho đến khi ta nhập số 0 và dừng => tổng

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập các số (thoát khi nhập 0 )");

		int data = sc.nextInt();
		long sum = 0;

		while (data != 0) {
			sum += data;
			System.out.println("Nhập các số (thoát khi nhập 0 )");
			data = sc.nextInt();
		}
		System.out.println("The total is : " + sum);
	}
}
