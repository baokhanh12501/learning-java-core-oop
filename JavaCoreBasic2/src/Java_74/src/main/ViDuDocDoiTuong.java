package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_74\\file.data");
			
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			
			
			SinhVien st = (SinhVien) ois.readObject();
			System.out.println(st.getDiemTB());
			System.out.println(st);
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
