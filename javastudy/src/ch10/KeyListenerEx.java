package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;	//3개의 메시지를 출력할 레이블 컴포넌트 배열
	public KeyListenerEx() {
		setTitle("KeyListener예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getkeyCode() ");
		keyMessage[1] = new JLabel("getkeyChar() ");
		keyMessage[2] = new JLabel("getkeyText() ");
		
		
		//3개의 레이블 컴포넌트 생성
		for(int i=0;i<keyMessage.length;i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);//배경색이 보이도록 불투명 속성 설정
			keyMessage[i].setBackground(Color.yellow);
		}
		
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();	//키 코드 알아내기
			char keychar = e.getKeyChar();	//키 문자 값 알아내기
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keychar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			System.out.println("KeyPressed");	//콘솔창에 메소드 이름 출력
			
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("key Typed");	//콘솔창에 메소드 이름 출력
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
