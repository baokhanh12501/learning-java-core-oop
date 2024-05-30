package com.khanhbh.jc05_structure_programming.sec01_seclection.sec05_conditional_expression;

public class ConditionalExpression {

	public static void main(String[] args) {
		// can tim max trong hai so a va b;
		int a, b;
		a = 10;
		b = 11;

		int max = (a > b) ? a : b;
		System.out.println("Gia tri max trong hai so a va b la: " + max);
	}

}
