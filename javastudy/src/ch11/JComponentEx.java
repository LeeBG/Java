package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("   Disabled Buton   ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b2.setBackground(Color.magenta);
		b1.setFont(new Font("Arial",Font.ITALIC,20));
		b2.setEnabled(false);		//버튼 비활성화
		b3.addActionListener(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX()+","+b.getY());//타이틀에 버튼 좌표 출력
			}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComponentEx();
	}
}
