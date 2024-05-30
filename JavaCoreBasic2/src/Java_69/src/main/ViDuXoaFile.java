package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx) {
		if(fx.isFile()) {
			// xoa neu la tap tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory()) {
			//lay cac file con
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				// xoa cac file con
				xoaFile(f);
			}
			// xoa ban than thu muc sau khi xoa file con
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}
	
//	public static void xoaFile2(File fx) {
//		// Su dung files.delete
//		if(fx.isFile()){
//			fx.delete();
//		}else if(fx.isDirectory()) {
//			File[] mangCon1 = fx.listFiles();
//		}
//	}
	
	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_69\\F0");
		File f0_1 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_69\\F0_1");
		File f_vidu = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_69\\Vidu.txt");
		
////		f0.deleteOnExit();
//		f0_1.deleteOnExit(); // xoa duoc vi la thu muc rong
//		
//		f_vidu.deleteOnExit();// xoa duoc vi la tap tin
//		
//		
//		ViDuXoaFile.xoaFile(f0);
//		
//		//Su dung class Files xoa tap tin va  thu muc
		
		Path p0 = f0.toPath(); 
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
		try {
//			Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
