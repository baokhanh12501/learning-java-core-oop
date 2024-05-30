package test;

import javax.swing.UIManager;

import model.LastButtonModel;
import view.LastButtonView;

public class Test {
	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFell");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		new LastButtonView();
		
	}
	
}
