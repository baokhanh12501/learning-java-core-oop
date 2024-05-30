package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {
	public static void main(String[] args) {
		/*cách1
		File f = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_72\\file.txt");
//		Path p = new Path("C:\\Users\\baokh\\eclipse-workspace\\Java_72\\file.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 */ 
		/* Cach 2 */
		File f2 = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_72\\file.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
