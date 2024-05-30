package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_73\\file.data");
			
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien st = new SinhVien("001", "Trần Bảo Khánh", 2001, 10);
			
			oos.writeObject(st);
			
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		
		
	}
}
