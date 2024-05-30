package Java_27;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		try {
			System.out.println("Nhap vao so nguyen n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu k dung");
		}finally {
			System.out.println("Finally!");
		}
		System.out.println("gia tri nhap la: " + n);
		System.out.println("ket thuc chuong trinh");
	}
}
