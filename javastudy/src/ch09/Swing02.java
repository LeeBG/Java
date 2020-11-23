package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Swing02 extends JFrame{
	
	public Swing02() {
		setTitle("플로우 레이아웃");
		setSize(300, 400);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());			//레이아웃 바꿔치기
		
		JButton btn1= new JButton("버튼1");
		JButton btn2= new JButton("버튼2");
		JButton btn3= new JButton("버튼3");
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.gray);
		c.add(jp1,BorderLayout.NORTH);
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Swing02();
	}
}
