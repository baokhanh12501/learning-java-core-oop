package com.khanhbh.jc05_structure_programming.sec01_seclection.sec03_multi_if_else_demo;

import java.util.Scanner;

public class MultiIfElseDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double dMark;

		System.out.print("Nhap diem cua sinh vien: ");
		dMark = new Scanner(System.in).nextDouble();

		// hiển thị học lực của sinh viên
		if (dMark >= 5 && dMark < 6) {
			System.out.println("Hoc luc trung binh");
		} else if (dMark >= 6 && dMark < 7) {
			System.out.println("Hoc luc trung binh kha");
		} else if (dMark >= 7 && dMark < 8) {
			System.out.println("Hoc luc kha");
		} else if (dMark >= 8 && dMark < 9) {
			System.out.println("Hoc luc gioi");
		} else if (dMark >= 9 && dMark <= 10) {
			System.out.println("Hoc luc xuat sac");
		} else {
			System.out.println("Hoc luc yeu");
		}
	}
}
