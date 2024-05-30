package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test_GridLayout2 extends JFrame{
	public Test_GridLayout2() {
		this.setTitle("Test_GridLayout");
		this.setSize(600,400);
		//center
		this.setLocationRelativeTo(null);
		
		
		//Set Layout
		GridLayout gridLayOut = new GridLayout();
		GridLayout gridLayOut2 = new GridLayout(4, 4);
		GridLayout gridLayOut3 = new GridLayout(4, 4 , 25 , 25);
		
//		this.setLayout(gridLayOut);
//		this.setLayout(gridLayOut2);
		this.setLayout(gridLayOut3);
		
		
		for (int i = 0; i < 16; i++) {
			JButton jb = new JButton(i+"");
			this.add(jb);
		}
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Test_GridLayout2();
	}
	JFrame jf = new JFrame();

}
