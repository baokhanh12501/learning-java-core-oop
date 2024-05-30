package com.khanhbh.jc05_structure_programming.sec01_seclection.excercise01;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// kiem tra nam nhuan

		Scanner sc = new Scanner(System.in);
		System.out.print("input a year: ");
		short year = sc.nextShort();
		sc.close();

		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);// expression

		System.out.println(year + " is leap year ? " + isLeapYear);
	}

}
