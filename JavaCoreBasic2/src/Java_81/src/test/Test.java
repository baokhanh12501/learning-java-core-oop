package test;

import javax.swing.UIManager;

import model.CounterModel;
import view.CounterView;

public class Test {

	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		System.out.println(ct.getValue());
		
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFell");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		CounterView ctv = new CounterView();
		
		
	}

}
