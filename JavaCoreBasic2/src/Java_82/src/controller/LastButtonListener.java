package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LastButtonModel;
import view.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView ltv;
	public LastButtonListener(LastButtonView ltv) {
		this.ltv = ltv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			ltv.a();
		}else if(src.equals("2")) {
			ltv.b();
		}else if(src.equals("3")) {
			ltv.c();
		}else if(src.equals("4")) {
			ltv.d();
		}
	}
	
	
}
