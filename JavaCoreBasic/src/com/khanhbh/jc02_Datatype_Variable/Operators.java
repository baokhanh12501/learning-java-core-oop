package com.khanhbh.jc02_Datatype_Variable;

public class Operators {

	public static void main(String[] args) {
		// Khái báo biến
		int a, b, c;
		// Gán dữ liệu
		a = 5;
		b = 3;
		c = 2;

		// 1 Toán tử số học
		System.out.println("Tổng hai số a và b là:" + (a + b));
		System.out.println("Hiệu hai số a và b là:" + (a - b));
		System.out.println("Tích hai số a và b là:" + (a * b));
		System.out.println("Hiệu hai số a và b là:" + (a / b));
		System.out.println("Hiệu dư hai số a và b là:" + (a % b));

		// 2 Toán tử gán
		a = (16 + 12);

		// 3 Toán tử logic && (and), || (or) , ! (Tìm hiểu toán rời rạc)
		// Khái niệm mệnh đề logic
		// 4 Toán tử so sánh > , < , >= , <= , == , !=
		boolean blnResult = (a >= b) && (c < b) || (a != c);
		System.out.println("Giá trị của luận lý là" + blnResult);

		// 5 Toán tử thao tác bit >> (dịch phải) , <<(dịch trái)
		System.out.println("Dịch phải của a: " + (a >> 2)); // a/2^2
		System.out.println("Dịch trái của a: " + (a << 2)); // a*2^2

		// 6 Toán tử 1 ngôi ++, --
		int i = 10;
		i++; // i +1
		System.out.println("Giá trị của i++: " + i);
		++i; // i = i+1 (tăng i rồi sử dụng)
		System.out.println("Giá trị của ++i: " + i);

		// 7 Toán tử viết tắt +=, -= , *= , /= , %=
		a += 10; // a=a+10
		System.out.println("giá trị của a là: " + a);

	}
}
