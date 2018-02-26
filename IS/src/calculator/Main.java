package calculator;

import java.awt.event.ActionListener;

public class Main {
	
	public static void main(String[] args) {
		GUI app = new  GUI();
		Obr obr = new Obr();
		obr.gui = app;
		app.b1.addActionListener(obr);
		app.setVisible(true);
	
	}
	
}
