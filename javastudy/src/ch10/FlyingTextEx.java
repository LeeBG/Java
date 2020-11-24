package ch10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{

	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("Hello");
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();		//키 입력을 받을 수 있도록 포커스 강제 지정
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			//키 코드값에 따라 상하좌우 키를 판별하고 la의 위치를 이동시킨다.
			switch(keyCode) {
			case KeyEvent.VK_UP://up키
				la.setLocation(la.getX(),la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN://down키
				la.setLocation(la.getX(),la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT://left키
				la.setLocation(la.getX()-FLYING_UNIT,la.getY());
				break;
			case KeyEvent.VK_RIGHT://right키
				la.setLocation(la.getX()+FLYING_UNIT,la.getY());
				break;
			
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
