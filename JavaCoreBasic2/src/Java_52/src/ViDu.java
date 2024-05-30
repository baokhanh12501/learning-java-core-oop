
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Khanh";
		String s2 = " Tran";

		String s3 = s1 + s2;
		// hàm concat => nối chuỗi

		String s4 = s1.concat(s2);

		System.out.println("s3: " + s3);

		System.out.println("s4: " + s4);

//		Hàm replace => thay thế
		
		String s5 = "Tran Bao Khanh";
		
		String s6 = s5.replaceAll("Tran Bao", "Tran");
		
		System.out.println("S6: "+ s6);
		
		// toLowerCase => Chuyển về viết thường
		// toUpperCase => chuyển về viết hoa
		
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		
		System.out.println("s7: "+s7);
		System.out.println("s8: "+s8);
		
		//hàm trim => xóa bỏ khoảng trắng dư thừa ở đầu chuỗi
		
		String s9 = " Khanh Tran ne";
		
		System.out.println(s9.trim());
		
		//hàm subString => hàm cắt chuỗi con
		
		String s10 = "Tran Bao Khanh ne ";
		String s11 = s10.substring(10);
		
		String s12 = s10.substring(10, 15);
		
		System.out.println("s11: " +s11);
		System.out.println("s12: " +s12);

		
		
		
		
		

	}
}
