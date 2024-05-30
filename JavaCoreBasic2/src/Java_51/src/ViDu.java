		
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chao tat ca moi nguoi, Xin chao! ";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'o';
		
		//Hàm indexOf
		
		System.out.println(s1.indexOf(s2));
		System.out.println(s3.indexOf(s1));
		
		// sử dụng vị trí bắt đầu
		System.out.println("Vi tri cua s2 trong s1: "+s1.indexOf(s2, 2));
	
		//Tìm kiếm char
		System.out.println("Vi tri cua c1 trong s1: "+s1.indexOf(c1));
		System.out.println("Vi tri cua c1 trong s1: "+s1.indexOf(c1, 20));
		
		//hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println(s1.lastIndexOf(s2));
		
		
	}
}
