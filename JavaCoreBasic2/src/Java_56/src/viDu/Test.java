package viDu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chao cac ban, toi la Khanh";

		String[] a = s.split(" ");

		System.out.println(Arrays.toString(a));

		String[] b = s.split(",");

		System.out.println(Arrays.toString(b)); 
		
		String s2 = "Hello everyone ,my name Khanh . im 22 year old";
		
		String [] c = s2.split("\\.|\\,");
		
		System.out.println(Arrays.toString(c));
		
		String s3 = "Tran Bao Khanh";
		
		String [] d = s3.split(" ");
		
		System.out.println(Arrays.toString(d));
		
		System.out.println("Ten: "+d[d.length-1]);
	}
}
