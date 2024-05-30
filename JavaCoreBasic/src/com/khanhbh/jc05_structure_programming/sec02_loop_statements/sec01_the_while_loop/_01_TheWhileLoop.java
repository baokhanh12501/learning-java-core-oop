package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec01_the_while_loop;

public class _01_TheWhileLoop {
	public static void main(String[] args) {
		// in ra từ 1 đến n

		int n = 100;
		int index = 0;

		while (index < n) {
			System.out.println("Giá trị thứ " + (index + 1) + "là: " + (index));
			index++;
		}
	}
}
