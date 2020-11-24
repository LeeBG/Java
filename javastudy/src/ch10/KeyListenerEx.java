package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;	//3���� �޽����� ����� ���̺� ������Ʈ �迭
	public KeyListenerEx() {
		setTitle("KeyListener����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getkeyCode() ");
		keyMessage[1] = new JLabel("getkeyChar() ");
		keyMessage[2] = new JLabel("getkeyText() ");
		
		
		//3���� ���̺� ������Ʈ ����
		for(int i=0;i<keyMessage.length;i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);//������ ���̵��� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.yellow);
		}
		
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();	//Ű �ڵ� �˾Ƴ���
			char keychar = e.getKeyChar();	//Ű ���� �� �˾Ƴ���
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keychar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			System.out.println("KeyPressed");	//�ܼ�â�� �޼ҵ� �̸� ���
			
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("key Typed");	//�ܼ�â�� �޼ҵ� �̸� ���
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
