package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame{

	private JButton btn1;
	private JLabel la1;
	
	public Event01() {
		setTitle("이벤트 01");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("클릭하세요");
		la1= new JLabel("클릭안됨");
		la1.setFont(new Font("serif",Font.BOLD,50));
		
		Container c = getContentPane();	//JFRAM이 기본적으로 가지고 있는 JFrame이 접근하기 위해
		c.add(la1,BorderLayout.CENTER);
		c.add(btn1,BorderLayout.SOUTH);
		
		//[첫번째방식]1.리스너 등록(리스너 = 인터페이스(메서드 전달을 위해서))		//인터페이스
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				la1.setText("클릭됨");
				
			}
		});	//메서드를 인수로 받는 방법 - 인터페이스 익명클래스
		
		//2.JVM(OS)이 어떤 이벤트가 발생했는지를 확인하고
		//3.발생된 이벤트를 이벤트 분배 스레드에 등록(대기열 등록)
		//4.순서대로 리스너가 실행됨.
		
		setVisible(true);		//생성자 가장 마지막에
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event01();
	}

}
