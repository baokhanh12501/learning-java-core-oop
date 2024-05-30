package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300, 300);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField jTextField = new JTextField(50);
		
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);

		JButton jb = new JButton("0");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb_cong = new JButton("+");
		JButton jb_tru = new JButton("-");
		JButton jb_nhan = new JButton("*");
		JButton jb_chia = new JButton("/");
		JButton jb_bang = new JButton("=");
		
		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(5, 3));

		
		jPanel_buttons.add(jb1);
		jPanel_buttons.add(jb2);
		jPanel_buttons.add(jb3);
		jPanel_buttons.add(jb4);
		jPanel_buttons.add(jb5);
		jPanel_buttons.add(jb6);
		jPanel_buttons.add(jb7);
		jPanel_buttons.add(jb8);
		jPanel_buttons.add(jb9);
		jPanel_buttons.add(jb);
		jPanel_buttons.add(jb_cong);
		jPanel_buttons.add(jb_tru);
		jPanel_buttons.add(jb_nhan);
		jPanel_buttons.add(jb_chia);
		jPanel_buttons.add(jb_bang);

		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		//com.sun.java.swing.plaf.gtk.GTKLookAndFee
		//com.sun.java.swing.plaf.motif.MotifLookAndFell
		//com.sun.java.swing.plaf.windows.WindowsLookAndFell
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFell");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new MyCalculator();
	}
}
