package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private LastButtonListener lb = new LastButtonListener(this);
	public JLabel jLabel = new JLabel("....");
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		
		JPanel jPanel_Center = new JPanel();
		jPanel_Center.setLayout(new GridLayout(2,2));
		
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		
		jPanel_Center.add(jButton1);
		jButton1.addActionListener(lb);
		jPanel_Center.add(jButton2);
		jButton2.addActionListener(lb);
		jPanel_Center.add(jButton3);
		jButton3.addActionListener(lb);
		jPanel_Center.add(jButton4);
		jButton4.addActionListener(lb);
		JPanel jPanel_Footer = new JPanel();
		
		
		jPanel_Footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		
		this.add(jPanel_Center,BorderLayout.CENTER);
		this.add(jPanel_Footer,BorderLayout.SOUTH);
		
		
		this.setVisible(true);
		
	}
	public void a() {
		lastButtonModel.setValue(1);
		jLabel.setText("last button pushed was no. "+lastButtonModel.getValue());
		
	}
	public void b() {
		lastButtonModel.setValue(2);
		jLabel.setText("last button pushed was no. "+lastButtonModel.getValue());
		
	}
	public void c() {
		lastButtonModel.setValue(3);
		jLabel.setText("last button pushed was no. "+lastButtonModel.getValue());
		
	}
	public void d() {
		lastButtonModel.setValue(4);
		jLabel.setText("last button pushed was no. "+lastButtonModel.getValue());
		
	}
	
}
