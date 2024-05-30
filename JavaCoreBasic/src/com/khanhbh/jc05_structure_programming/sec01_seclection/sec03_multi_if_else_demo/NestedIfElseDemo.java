package com.khanhbh.jc05_structure_programming.sec01_seclection.sec03_multi_if_else_demo;

public class NestedIfElseDemo {
	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 2;
		c = 3;

		if (a > b) {
			if (a > c) {
				System.out.println("a > b va a > c ");
			} else {
				System.out.println("a>b && a<=c");
			}
		} else {
			System.out.println("a<=b");
		}
	}
}
