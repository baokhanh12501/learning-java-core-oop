package vidu;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	
	public static int [] reverse(int[] x) {
		int[] rs = new int [x.length];
		int index = 0;
		for(int i =x.length -1; i>=0;i--) {
			rs[index] = x[i];
			index ++;
		}
		
		return rs;
		
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };

		int[] b = new int[15];
		
		System.out.println("a: "+ Arrays.toString(a));
		//hàm sắp xếp tăng dần
		Arrays.sort(a);
		System.out.println("sap xep a: "+ Arrays.toString(a));
		//hàm tìm kiếm
		
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
		//hàm điền giá trị
		
		Arrays.fill(b, 5);
		
		System.out.println("B: "+ Arrays.toString(b));
		
		//hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = Test.reverse(a);
		System.out.println("sap xep a giam dan"+Arrays.toString(a));
		
		
	}
}
