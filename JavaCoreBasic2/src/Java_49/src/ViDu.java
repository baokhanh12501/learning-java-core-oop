import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;

		System.out.println("Nhập vào chuỗi: ");

		s = sc.nextLine();

		System.out.println("-----");

		// Hàm length()

		System.out.println(s.length());
		int doDai = s.length();
		
		
		//hàm charAt => lấy ra 1 kí tự tại vị trí
		for (int i = 0; i < doDai; i++) {
			System.out.println("vi tri "+i+ " la " +s.charAt(i));
			
		}
		//Hàm getChars(vị trí bắt đầu , kết thúc , mảng dữ liệu , vị trí bắt đầu lưu của mảng)
		char[] arrayChar = new char[100];
		s.getChars(2, 10, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println("Mảng giá trị tại "+i +" là"+arrayChar[i]);
		}
		
	}
}
