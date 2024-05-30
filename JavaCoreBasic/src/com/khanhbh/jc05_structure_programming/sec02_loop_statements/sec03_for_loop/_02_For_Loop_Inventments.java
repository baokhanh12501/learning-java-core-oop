package com.khanhbh.jc05_structure_programming.sec02_loop_statements.sec03_for_loop;

import java.util.Scanner;

public class _02_For_Loop_Inventments {
	public static void main(String[] args) {
		final double RATE = 5;
		final double INTTIAL_BALANCE = 10000000;

		double balance = INTTIAL_BALANCE;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of year: ");
		int nYears = sc.nextInt();

		for (int year = 1; year < nYears; year++) {
			double interest = balance * RATE / 100;
			balance += interest;
			System.out.printf("%4d %10.2f\n", year, balance);
		}
	}
}
