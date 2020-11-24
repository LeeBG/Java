package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener {

	private JLabel laTitle;
	private JButton btn1, btn2, btn3;
	private Container c;
	private int count=0;

	public Event02() {

		laTitle = new JLabel("사과"+count);
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.add(laTitle, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.CENTER);
		c.add(btn3, BorderLayout.EAST);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		setTitle("Event02");
		setSize(400, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("클릭됨"+e.getSource());//getSource 오브젝트 클래스
		JButton btn = (JButton)e.getSource();		//stack변수 btn > 버튼
		System.out.println(btn.getText());
		
		//조건문으로 
		if(btn.getText().equals("딸기 클릭")) {
			count++;
			laTitle.setText("딸기");
		}else if(btn.getText().contains("바나나")) {
			count++;
			laTitle.setText("바나나"+count);
		}else if(btn.getText().contains("참외")) {
			count++;
			laTitle.setText("참외"+count);
		}
	}
	
	public static void main(String[] args) {
		new Event02();
	}
}
