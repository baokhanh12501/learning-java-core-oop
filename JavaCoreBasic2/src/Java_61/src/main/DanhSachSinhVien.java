package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhsach;

	public DanhSachSinhVien() {
		this.danhsach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
		this.danhsach = danhsach;
	}

	// Thêm sinh viên
	public void themSinhVien(SinhVien sv) {
		this.danhsach.add(sv);
	}

	// In danh sách sinh viên
	public void inDanhSachSinhVien(SinhVien sv) {
		for (SinhVien sinhVien : danhsach) {
			System.out.println(sinhVien);
		}
	}

	// Kiểm tra danh sách có rỗng hay không
	public boolean kiemTraDanhSachRong() {
		return this.danhsach.isEmpty();
	}

	// Lấy ra số lượng sinh viên trong danh sách
	public int laySoLuongSinhVien() {
		return this.danhsach.size();
	}

	// Làm rỗng danh sách sinh viên
	public void lamRongDanhSach() {
		this.danhsach.removeAll(danhsach);
	}

	// Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh
	// viên
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhsach.contains(sv);
	}

	// Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhsach.remove(sv);
	}

	// Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhsach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
	//Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhsach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTB()< sv2.getDiemTB()) {
					return 1;
				}else if(sv1.getDiemTB() > sv2.getDiemTB()) {
					return -1;
				}else {
					return 0;
				}			
			}
			
		});;
	}

}
