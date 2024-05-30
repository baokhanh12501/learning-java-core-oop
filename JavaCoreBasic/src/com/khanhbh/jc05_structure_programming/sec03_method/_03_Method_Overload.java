package com.khanhbh.jc05_structure_programming.sec03_method;

public class _03_Method_Overload {

	public static void main(String[] args) {
		// a , b => max
		// định nghĩa nạp chồng (overload) : là kỹ thuật viết cùng tên hàm
		// nhưng có tham số khác nhau or kiểu trả về khác nhau
		@SuppressWarnings("unused")
		double n1, n2, n3;
		n1 = 10.2;
		n2 = 11.0;
		n3 = 88.9;

		System.out.println("Max is " + max(n1, n2, n3));
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static double max(double a, double b) {
		return (a > b) ? a : b;
	}

	public static double max(double a, double b, double c) {
		return max(max(a, b), c);
	}
}
