package com.khanhbh.jc05_structure_programming.sec03_method;

public class _01_Method_Demo {
	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 11;
		System.out.println("sum is: " + sum(a, b));
	}

	// Define a funtion/method
	public static double sum(double a, double b) {
		// code
		double c = a + b;
		return (c);
	}
}
