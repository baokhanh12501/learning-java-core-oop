package com.khanhbh.jc05_structure_programming.sec03_method;

public class _04_Method_Recursuon_Factorial {
	public static void main(String[] args) {
		// n! ... 0!= 1
		// đệ quy là cách thức lặp mà trong thân hàm lại gọi chính nó . nhưng
		// nó phải có một điều kiện dừng (base)
		System.out.println("Giai thừa của n là:  " + factorial(5));
	}

	public static int factorial(int n) {
		if (n == 0)// base on
			return 1;
		return n * factorial(n - 1);
	}
}
