package view;

import javax.swing.JFrame;

public class ViDu {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Vi du JFrame");
		jf.setSize(600,400);
		
		
		//Vi tri hien thi
		jf.setLocation(300,300);
		
		
//		while(true) {
//			System.out.println("Chuong trinh dang chay");
//		}
		// thoat ra khoi chuong trinh khi dong cua so JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jf.setVisible(true);
	}

}
