package ch09;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;


public class Swing04 extends JFrame {
	
	private JButton btn1,btn2,btn3;
	private JLabel lab1,lab2,lab3;
	private JPanel jp1,jp2;
	
	private void initObject() {
		jp1 = new JPanel();
		btn1= new JButton("Open");
		btn2 = new JButton("Read");
		btn3 = new JButton("Close");
		lab1 = new JLabel("Hello");
		lab2 = new JLabel("Java");
		lab3 = new JLabel("Love");
		jp2 = new JPanel();
	}
	private void initSetting() {
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//±â¾ï
		jp1.setBackground(Color.gray);
		getContentPane().add(jp1, BorderLayout.NORTH);
		getContentPane().add(jp2, BorderLayout.CENTER);
		jp2.setLayout(null);
		lab1.setBounds(12, 149, 57, 15);
		lab2.setBounds(145, 10, 57, 15);
		lab3.setBounds(276, 116, 57, 15);
	}
	private void initBatch() {
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		jp2.add(lab1);
		jp2.add(lab2);
		jp2.add(lab3);
	}
	public Swing04() {
		getContentPane().setFont(new Font("CookieRun Regular", Font.PLAIN, 12));	
		initObject();
		initSetting();
		initBatch();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
