package com.khanhbh.jc05_structure_programming.sec02_loop_statements.excercise01;

public class DoubleInventment {

	public static void main(String[] args) {
		// yêu cầu:Giả sử ta có 1 số dư gửi ngân hàng ban đầu là balance. cần
		// tính sau bao lâu thì số balence sẽ tăng gấp đôi
		// biết lãi xuất = 5%/năm
		final double RATE = 5;
		final double INTTIAL_BALANCE = 10000000;
		final double TARGET = 2 * INTTIAL_BALANCE;

		double balance = INTTIAL_BALANCE;

		int year = 0;

		while (balance < TARGET) {
			year++;
			double interest = balance * RATE / 100;
			balance += interest;
		}
		System.out.println("The inventments double after " + year + " year to have " + balance);
	}

}
