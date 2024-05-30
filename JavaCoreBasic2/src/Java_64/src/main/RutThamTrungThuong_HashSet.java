package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new TreeSet<String>();

	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraPhieu(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}

	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}

	public String rutTham() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}

	public RutThamTrungThuong_HashSet() {
	}

	public static void main(String[] args) {
		Set<String> tapHopPhieuDuThuong = new HashSet<String>();
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do {
			System.out.println("--------------------------");
			System.out.println("MENU: ");
			System.out.println("1.Thêm mã số dự thưởng.");
			System.out.println("2.Xóa mã số dự thưởng.");
			System.out.println("3.Kiểm tra mã số dự thưởng có tồn tại hay không.");
			System.out.println("4.Xóa tất cả phiếu dự thưởng.");
			System.out.println("5.Số lượng phiếu dự thưởng.");
			System.out.println("6.Rút thăm trúng thưởng.");
			System.out.println("7.In ra tất cả phiếu trúng thưởng.");
			System.out.println("0.Thoát");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào mã phiếu dự thưởng");
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					rt.themPhieu(giaTri);
				} else if (luaChon == 2) {
					rt.xoaPhieu(giaTri);
				} else {
					System.out.println("Kết quả kiếm tra: " + rt.kiemTraPhieu(giaTri));
					
				}

			}else if(luaChon ==4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if(luaChon == 5) {
				System.out.println("Số lượng phiếu là: " + rt.laySoLuong());
				
			}else if(luaChon == 6){
				System.out.println("Mã số trúng thưởng là: "+ rt.rutTham());
			}else if(luaChon == 7){
				System.out.println("Các mã phiếu dự thưởng: ");
				rt.inTatCa();
			}
				

		} while (luaChon != 0);
	}
}
