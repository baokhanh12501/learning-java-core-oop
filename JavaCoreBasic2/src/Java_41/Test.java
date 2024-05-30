package Java_41;

public class Test {
	public static void main(String[] args) {
		NguoiBaLan nbl = new NguoiBaLan("Tomek", 2002);
		NguoiVietNam nvn = new NguoiVietNam("Khanh", 2001);
		NguoiMy nm = new NguoiMy("Michel", 2000);
		
		nbl.xinChao();
		nvn.xinChao();
		nm.xinChao();
	}
}
