package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing01 extends JFrame{
//Swing은 내부적으로 While이 돌고 있음. 데몬프로세스(꺼지지 않는다) = 계속돌면서 그림을 분사
	public Swing01() {
		setTitle("제목");
		setSize(300,500);
		Container c = getContentPane();
		//JPanel = (JFrame이 기본적으로 가지고 있는 패널)
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		
		JPanel jp1 =new JPanel();
		
		
		
		c.add(btn1,MyLayout.WEST.getValue());	//패널에다가 버튼 추가 [enum사용]
		c.add(btn2,Batch.EAST);					//인터페이스는 하나의 값만 가능 
		c.add(btn3,BorderLayout.NORTH);
		c.add(jp1,BorderLayout.CENTER);
		c.add(btn5,BorderLayout.SOUTH);		//위의 인터페이스와 같다. 사용
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
