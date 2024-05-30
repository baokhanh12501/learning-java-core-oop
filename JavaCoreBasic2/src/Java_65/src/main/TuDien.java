package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> duLieu = new TreeMap<String, String>();

	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);

	}

	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
	}

	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------");
			System.out.println("MENU");
			System.out.println("1. Thêm từ(Từ khóa, ý ngĩa)");
			System.out.println("2. Xóa từ");
			System.out.println("3. Tra từ");
			System.out.println("4. In ra danh sách từ khóa");
			System.out.println("5. In ra số lượng từ");
			System.out.println("6. Xóa tất cả từ khóa");
			System.out.println("0. Thoát");
			
			luaChon = sc.nextInt();
			sc.nextLine();

			if (luaChon == 1) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
			} else if (luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				if (luaChon == 2) {
					tuDien.xoaTu(tuKhoa);
				} else {
					System.out.println("Ý nghĩa của từ: " + tuDien.traTu(tuKhoa));
				}
			} else if (luaChon == 4) {
				tuDien.inTuKhoa();
			} else if (luaChon == 5) {
				System.out.println("Số lượng từ khóa là: " + tuDien.laySoLuong());
			} else {
				tuDien.xoaTatCa();
			}

		} while (luaChon != 0);

	}
}
