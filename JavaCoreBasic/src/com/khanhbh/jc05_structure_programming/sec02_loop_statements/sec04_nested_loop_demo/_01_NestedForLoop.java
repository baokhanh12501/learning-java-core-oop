package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec04_nested_loop_demo;

public class _01_NestedForLoop {
	public static void main(String[] args) {
		// yêu cầu: In ra bảng cửu chương theo không gian 2 chiều(2D)

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
