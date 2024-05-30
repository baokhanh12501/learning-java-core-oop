package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test_BoderLayout extends JFrame{
	public Test_BoderLayout() {
		this.setTitle("Test_BoderLayout");
		this.setSize(600,400);
		//center
		this.setLocationRelativeTo(null);
		
		BorderLayout borderLayout = new BorderLayout();
		BorderLayout borderLayout2 = new BorderLayout(15, 15);
		
//		this.setLayout(borderLayout);
		this.setLayout(borderLayout2);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		
		//add component
		this.add(jb1, BorderLayout.NORTH); // bac
		this.add(jb2, BorderLayout.SOUTH); // nam
		this.add(jb3, BorderLayout.WEST); // tay
		this.add(jb4, BorderLayout.EAST); // dong
		this.add(jb5, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Test_BoderLayout();
	}
	JFrame jf = new JFrame();

}
