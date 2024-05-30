
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Khanh";
		String s2 = "khanh";
		String s3 = "Khanh";
		
		//Hàm equal => so sanh 2 chuoi giong nhau, có phân biệt hoa thường
		System.out.println("s1 equals s2: " +s1.equals(s2));
		System.out.println("s1 equals s3: " +s1.equals(s3));
		
		//hàm equalsIgnoreCase so sanh 2 chuoi giong nhau, ko phân biệt hoa thường
		
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
		// hàm compareTo => so sánh > < = 
		
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn a";
		
		System.out.println("sv1 compareTo sv2: " +sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " +sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " +sv1.compareTo(sv4));
		
		// hàm compareToIgnoreCase , tương tự nhưng k pb hoa thường
		
		System.out.println("sv1 compareToIgnoreCase sv4:" + sv1.compareToIgnoreCase(sv4));
		
		
		//hàm regionMatches => so sánh 1 đoạn
		
		String r1 = "Khanh";
		String r2 = "KhanhTran";
		boolean check = r1.regionMatches(2, r2, 2, 2);
		System.out.println(check);
		
		// hàm startWith => kiểm tra chuỗi bắt đầu
		
		
	}
}
