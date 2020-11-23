package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz extends JFrame{

	public Quiz() {
		setTitle("버튼 레이아웃");
		setSize(300, 400);
		Container c = getContentPane();
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JPanel jp = new JPanel();
		
		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.CENTER);
		c.add(jp,BorderLayout.SOUTH);
		jp.add(btn3);
		jp.add(btn4);
		jp.add(btn5);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Quiz();
	}

}
