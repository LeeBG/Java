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

		laTitle = new JLabel("���"+count);
		btn1 = new JButton("���� Ŭ��");
		btn2 = new JButton("�ٳ��� Ŭ��");
		btn3 = new JButton("���� Ŭ��");
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
		System.out.println("Ŭ����"+e.getSource());//getSource ������Ʈ Ŭ����
		JButton btn = (JButton)e.getSource();		//stack���� btn > ��ư
		System.out.println(btn.getText());
		
		//���ǹ����� 
		if(btn.getText().equals("���� Ŭ��")) {
			count++;
			laTitle.setText("����");
		}else if(btn.getText().contains("�ٳ���")) {
			count++;
			laTitle.setText("�ٳ���"+count);
		}else if(btn.getText().contains("����")) {
			count++;
			laTitle.setText("����"+count);
		}
	}
	
	public static void main(String[] args) {
		new Event02();
	}
}
