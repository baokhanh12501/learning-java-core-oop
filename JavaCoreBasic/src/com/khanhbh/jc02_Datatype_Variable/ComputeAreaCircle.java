package com.khanhbh.jc02_Datatype_Variable;

import java.util.Scanner;

public class ComputeAreaCircle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào r: ");
		double radius = sc.nextDouble();

		double area = 3.14159 * radius * radius;

		System.out.println("Diện tích hình tròn: " + area);
	}
}
