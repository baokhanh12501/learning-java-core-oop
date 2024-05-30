package com.khanhbh.jc05_structure_programming.sec03_method;

public class _02_Method_GCD {

	public static void main(String[] args) {
		int n1, n2;
		n1 = 255;
		n2 = 45;
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is: " + gcd(n1, n2));

	}

	public static int gcd(int a, int b) {
		int gcd = 1; // return
		int i = 2;
		while (i <= a && i <= b) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
			i++;
		}
		return gcd;
	}

}
