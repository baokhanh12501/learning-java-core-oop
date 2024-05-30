package com.khanhbh.jc05_structure_programming.sec01_seclection.sec06_swich_care_demo;

import java.util.Scanner;

public class SwichCareDemo {
	public static void main(String[] args) {
		// can in ra thang trong nam

		System.out.print("Nhap thang: ");
		int month = new Scanner(System.in).nextInt();

		switch (month) {
		case 1: {
			System.out.println("Thang 1");
			break;
		}
		case 2: {
			System.out.println("Thang 2");
			break;
		}
		case 3: {
			System.out.println("Thang 3");
			break;
		}
		case 4: {
			System.out.println("Thang 4");
			break;
		}
		case 5: {
			System.out.println("Thang 5");
			break;
		}
		case 6: {
			System.out.println("Thang 6");
			break;
		}
		case 7: {
			System.out.println("Thang 7");
			break;
		}
		case 8: {
			System.out.println("Thang 8");
			break;
		}
		case 9: {
			System.out.println("Thang 9");
			break;
		}
		case 10: {
			System.out.println("Thang 10");
			break;
		}
		case 11: {
			System.out.println("Thang 11");
			break;
		}
		case 12: {
			System.out.println("Thang 12");
			break;
		}
		default:
			System.out.println("Nothing month " + month);
			break;
		}
	}
}
