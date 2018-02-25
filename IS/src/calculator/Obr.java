package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Obr implements ActionListener{
	float x, y, z, r, s;
	String a;
	Obr handler;
	
	public void actionPerformed(ActionEvent o) {
		GUI gui = new GUI();
		if(o.getSource()==gui.b1) {
			x = Integer.parseInt(gui.t1.getText());
			y = Integer.parseInt(gui.t2.getText());
			z = Integer.parseInt(gui.t3.getText());
			r = x/100*y;
			s = r*z;
			a = "Расход топлива на " + y + "км равна " + Math.round(r) + "литров за " + Math.round(s) + "рублей";
			gui.l5.setText(a);
			
		}
		
	}
	
}

