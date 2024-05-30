package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * một người chơi sẽ có tài khoản. người chơi có quyền đặt cược số 
 * tiền ít hơn hoặc bằng số tiền họ đang có
 * Luật chơi:
 * Có 3 viên xúc sắc mỗi viên 6 mặt có gtri từ 1 đến 6
 * mỗi lần xúc sẽ được 1 kq 
 * 1. tổng = 3 hoặc 18 => cái ăn hết người chơi thua
 * 2. 4->10 xỉu 
 * 3. 11->17 tài
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoan = 500000;

		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getInstance(lc);
		
		
		int luaChon = 1;
		do {
			System.out.println("------------Mời bạn chọn--------------");
			System.out.println("Chọn 1 để tiếp tục chơi.");
			System.out.println("Chọn phím bất kì để thoát .");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("*** Bắt đầu chơi ***");
				System.out.println("Tài khoản của bạn có: " + numf.format(taiKhoan) + ", bạn muốn cược bao nhiêu? ");
				double datCuoc = 0;

				do {
					System.out.println("****** Đặt cược (0<số tiền cược <= " + numf.format(taiKhoan) + ":");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoan);

				int luaChonTaiXiu = 0;

				do {
					System.out.println("****** Chọn 1: Tài hoặc 2: Xỉu ");
					luaChonTaiXiu = sc.nextInt();

				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				// Tung xúc sắc

				Random xucXac = new Random();
		

				int giaTri1 = xucXac.nextInt(5) + 1;
				int giaTri2 = xucXac.nextInt(5) + 1;
				int giaTri3 = xucXac.nextInt(5) + 1;

				// tính kết quả

				int ketQua = giaTri1 + giaTri2 + giaTri3;
				System.out.println("****** Kết quả:"+giaTri1+" "+giaTri2+" "+giaTri3 );
				System.out.println("****** Tổng là: "+ketQua );

				if (ketQua == 3 || ketQua == 18) {
					taiKhoan -= datCuoc;
					System.out.println("****** Tổng là: " + ketQua + " nhà cái ăn");
					System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoan));

				} else if (ketQua >= 4 && ketQua <= 10) {
					System.out.println("****** Tổng là: " + ketQua + " => xỉu ");
					if (luaChonTaiXiu == 2) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoan += datCuoc;
						System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoan));

					} else {
						System.out.println("****** Bạn đã thua");
						taiKhoan -= datCuoc;
						System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoan));

					}

				} else {
					System.out.println("****** Tổng là: " + ketQua + " => Tài ");
					if (luaChonTaiXiu == 1) {
						System.out.println("****** Bạn đã thắng cược");
						taiKhoan += datCuoc;
						System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoan));

					} else {
						System.out.println("****** Bạn đã thua");
						taiKhoan -= datCuoc;
						System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoan));
					}
				}
			}

		} while (luaChon == 1);

	}
}