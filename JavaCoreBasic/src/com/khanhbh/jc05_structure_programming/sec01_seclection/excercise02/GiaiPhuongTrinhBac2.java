package com.khanhbh.jc05_structure_programming.sec01_seclection.excercise02;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
	public static void main(String[] args) {
		// ax^2+bx+c=0

		// 1 Nhập giá trị cho tham số
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a,b,c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		// 2 Tính delta
		double delta = Math.pow(b, 2) - 4 * a * c;

		// 3 Hiển thị nghiệm
		System.out.println("Nghiem cua phuong trinh: ");
		if (delta > 0) {
			double n1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
			double n2 = (b + Math.pow(delta, 0.5)) / 2 * a;
			System.out.println("Nghiem 1: " + n1 + "va" + "nghiem 2: " + n2);
		} else if (delta == 0) {
			double n1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
			System.out.println("Phuong trinh co 1 nghiem : " + n1);
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}
		sc.close();
	}
}
