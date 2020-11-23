package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EX527 extends JFrame{


	public EX527() {
		setSize(400,500);
		setTitle("P527_EX");
		Container c = getContentPane();
		Container c2 = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		JLabel lab1 = new JLabel("hello");
		
		lab1.setLocation(200, 170);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(lab1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EX527();
	}

}
