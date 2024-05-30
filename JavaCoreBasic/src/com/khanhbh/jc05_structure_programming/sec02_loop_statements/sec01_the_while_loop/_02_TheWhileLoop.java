package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec01_the_while_loop;

public class _02_TheWhileLoop {
	public static void main(String[] args) {
		long sum = 0;
		int n = 100;
		int index = 0;

		while (index < n) {
			sum += index;
			index++;
		}
		System.out.println("sum is: " + sum);
	}
}
