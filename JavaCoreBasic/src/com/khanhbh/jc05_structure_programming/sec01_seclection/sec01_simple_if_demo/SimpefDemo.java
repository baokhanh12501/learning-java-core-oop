package com.khanhbh.jc05_structure_programming.sec01_seclection.sec01_simple_if_demo;

import java.util.Scanner;

public class SimpefDemo {

	public static void main(String[] args) {
		double radius, area;
		final double PI = 3.14156;

		// dung lop Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Radius: ");
		radius = sc.nextDouble();

		// lựa chọn

		if (radius >= 0) {
			// Statements
			area = radius * radius * PI;
			System.out.println("The area of cricle " + radius + "is " + area);
		}
	}
}
