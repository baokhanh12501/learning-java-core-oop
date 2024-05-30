package com.khanhbh.jc06_Array_Static;

public class _05_ArrayMultiDimension {

	public static void main(String[] args) {
		// 1. khai báo mảng 2 chiều
		@SuppressWarnings("unused")
		double[][] arrayData = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 16 } };
		// 2. khai báo mảng 2 chiều bằng cách định nghĩa size
		double[][] lstData = new double[5][3];
		// fill giá trị
		for (int row = 0; row < lstData.length; row++) {
			for (int col = 0; col < lstData[row].length; col++) {
				lstData[row][col] = Math.round(Math.random() * 100000);

			}
		}
		// Hiển thị
		display(lstData);
	}

	public static void display(double[][] lst) {
		for (int i = 0; i < lst.length; i++) {
			for (int j = 0; j < lst[i].length; j++) {
				System.out.println(lst[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
