package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test_FlowLayout extends JFrame{
	public Test_FlowLayout() {
		this.setTitle("Test_FlowLayout");
		this.setSize(600,400);
		//center
		this.setLocationRelativeTo(null);
		
		FlowLayout flowLayOut = new FlowLayout();
		FlowLayout flowLayOut2 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayOut3 = new FlowLayout(FlowLayout.CENTER, 50, 50);
		
//		this.setLayout(flowLayOut);
//		this.setLayout(flowLayOut2);
		this.setLayout(flowLayOut3);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		
		//add component
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Test_FlowLayout();
	}
	JFrame jf = new JFrame();

}
