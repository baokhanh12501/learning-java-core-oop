import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// kiểu nguyên thủy

		int[] mang1 = { 1, 2, 3 };

		// coppy mảng

		int[] mang1_a = mang1;
		mang1_a[0] = 100;

		System.out.println("mang 1: " + Arrays.toString(mang1));

		System.out.println("mang 1_a: " + Arrays.toString(mang1_a));

		// coppy mảng - hàm clone

		int[] mang1_b = mang1.clone();

		mang1_a[0] = 50;

		System.out.println("mang 1_b: " + Arrays.toString(mang1_a));

		// coppy mảng - hàm System

		int[] mang1_c = new int[mang1.length];
		
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		
		mang1_c[0] = 90;
		
		System.out.println("mang 1_c: " + Arrays.toString(mang1_c));
		
		//Kiểu nguyên thủy
		
		String [] mang_doi_tuong = {"Khanh", "Tran" };
		
		
		
	}
}
