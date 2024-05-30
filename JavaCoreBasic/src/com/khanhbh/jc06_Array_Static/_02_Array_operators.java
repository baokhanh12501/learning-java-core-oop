package com.khanhbh.jc6_Array_Static;

public class _02_Array_operators {
	public static void main(String[] args) {
		// 1 khai báo
		final int INIT_SIZE_ARRAY = 100;
		double[] numbers = new double[INIT_SIZE_ARRAY];
		// 2 fill vào mảng
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.round(Math.random() * 1000000);
		}
		// 3 display dữ liệu ra màn hình
		displayArray(numbers);
	}

	public static void displayArray(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Phần tử thứ " + (i + 1) + " là " + numbers[i]);
		}
	}
}
