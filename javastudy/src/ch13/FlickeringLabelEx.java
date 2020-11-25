package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;	//배경색이 바뀌는 시간 . 밀리 초 단위
	
	public FlickeringLabel(String text, long delay) {
		
		super(text);		//JLable생성자 호출
		this.delay = delay;
		setOpaque(true);	//배경색 변경이 가능하도록 설정
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0) {
				setBackground(Color.YELLOW);
			}else
				setBackground(Color.GREEN);
			if(n==0) n =1;
			else n = 0;
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabel예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
		
		JLabel label = new JLabel("안깜빡");
		
		FlickeringLabel fLabel2  = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
