package com.khanhbh.jc6_Array_Static;

import java.util.Arrays;

public class _03_Array_Coppy_To_Other {
	public static void main(String[] args) {

		// khai báo
		int[] numbers = new int[] { 12, 2, 3, 5, 4, 775, 48 };

		int[] numbersCoppy = numbers;

		int[] numbersCoppy2 = Arrays.copyOf(numbers, numbers.length);

		int[] numbersCoppy3 = new int[numbers.length + 100];
		System.arraycopy(numbers, 0, numbersCoppy3, 0, numbers.length);
		// hiển thị ra ngoài
		displayArray(numbersCoppy2);
	}

	public static void displayArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Phần tử thứ " + (i + 1) + " là " + numbers[i]);
		}

	}
}
