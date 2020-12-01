package ch12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class paintComponentEx extends JFrame{

	public paintComponentEx() {
		setTitle("새로운 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyButton b =new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		c.add(b);
		setSize(250,200);
		setVisible(true);
	}
	class MyButton extends JButton{
		public MyButton(String s) {
			super(s);
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);//JButton에게 기본 버튼 모양을 그리도록 한다.
			//Jbutton의 기본 모양 위에 추가적으로 빨간색으로 버튼 크기만한 타원을 그린다.
			g.drawOval(0, 0, getWidth()-1, getHeight()-1);
		
		}
	}
	public static void main(String[] args) {
		new paintComponentEx();
	}

}
