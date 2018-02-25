package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
	public JButton b1;
	public JLabel l1, l2, l3, l4, l5, l6;
	public JTextField t1, t2, t3;
	//public Obr handler = new Obr();

	

	public GUI () {
		super("Расчет расхода топлива");//Название окна
		this.setSize(500,200);//Размер окна
		this.setResizable(false);//Запрет на изменение размера окна
		this.setLocationRelativeTo(null);//окно по середине экрана
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		b1 = new JButton("Посчитать");
		l1 = new JLabel("Введите данные:");
		l2 = new JLabel("Расход на 100км:");
		l3 = new JLabel("Расстояние:");
		l4 = new JLabel("Стоимость топлива:");
		l5 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(l5);
		b1.addActionListener(handler);
		
	}


}
	

