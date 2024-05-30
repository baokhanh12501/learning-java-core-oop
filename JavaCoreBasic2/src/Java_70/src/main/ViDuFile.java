package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
	public static void coppyAll(File f1, File f2) {
		try {
			// coppy ban than n
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f1.isDirectory()) {
			// copy cac tap tin va thu muc con
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile() + "/" + file.getName());
				coppyAll(file, file_new);
			}
		}
	}

	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\File_1.txt");
		File f1 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\File_2.txt");
		File f2 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\File_2xyz.txt");

		// 1. thay đổi tên tap tin hoặc thu mực
		// Sử dụng File để thay đổi tên
//		f0.renameTo(f1);

		// sử dụng Files để thay đổi tên

//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 2. Di chuyển file
//		File f_2new = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\F0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		File f_0 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\F0");
		File f_0_coppy = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_70\\F0_coppy");
//		try {
//			Files.copy(f_0.toPath(), f_0_coppy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		ViDuFile.coppyAll(f_0, f_0_coppy);
	}
}
