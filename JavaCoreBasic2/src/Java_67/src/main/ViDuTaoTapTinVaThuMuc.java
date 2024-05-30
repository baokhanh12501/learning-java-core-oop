package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		//lưu ý : sử dụng \\
		//kiểm tra thư mục hoặc tập tin có tồn tại hay không?
		
		File folder1 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_67");
		
		File folder2 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_68");
		
		System.out.println("Check folder1: "+ folder1.exists());
		
		System.out.println("Check folder2: "+ folder2.exists());
		
		//tạo folder
		//phương thức mkdir() => tạo 1 folder
		
		File d1 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_67\\Directoty_1");
		
		d1.mkdir();
		//phương thức mkdirs() => tạo nhiều thư mục cùng lúc
		
		File d2 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_67\\Directoty_1\\Directoty_2\\Directoty_3");
		
		d2.mkdirs();
		
		// tạo tập tin(có phần mở rộng: .exe .txt .doc .xls .....)
		
		File file1 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_67\\Directoty_1\\vidu1.txt");
		
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// không có quyền tạo tệp tin
			// ổ cứng đầy
			// đường dẫn sai
			e.printStackTrace();
		}
		
		
		
	}
}
