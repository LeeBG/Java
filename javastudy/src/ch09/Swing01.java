package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing01 extends JFrame{
//Swing�� ���������� While�� ���� ����. �������μ���(������ �ʴ´�) = ��ӵ��鼭 �׸��� �л�
	public Swing01() {
		setTitle("����");
		setSize(300,500);
		Container c = getContentPane();
		//JPanel = (JFrame�� �⺻������ ������ �ִ� �г�)
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		
		JPanel jp1 =new JPanel();
		
		
		
		c.add(btn1,MyLayout.WEST.getValue());	//�гο��ٰ� ��ư �߰� [enum���]
		c.add(btn2,Batch.EAST);					//�������̽��� �ϳ��� ���� ���� 
		c.add(btn3,BorderLayout.NORTH);
		c.add(jp1,BorderLayout.CENTER);
		c.add(btn5,BorderLayout.SOUTH);		//���� �������̽��� ����. ���
		jp1.add(btn6);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing01();
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.getValue());
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		new Swing01();
	}

}
