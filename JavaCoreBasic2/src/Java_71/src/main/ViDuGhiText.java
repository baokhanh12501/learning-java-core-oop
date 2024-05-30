package main;

import java.io.PrintWriter;

public class ViDuGhiText {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\baokh\\eclipse-workspace\\Java_71\\file.txt", "UTF-8");
			pw.println("Xin chao minh la Khanh");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(" ");
			pw.print("là số PI");
			pw.println();
			Student st = new Student(100, "Trần Bảo Khánh");
			pw.println(st);
			pw.println();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
