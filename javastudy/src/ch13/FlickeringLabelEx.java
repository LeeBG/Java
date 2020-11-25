package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;	//������ �ٲ�� �ð� . �и� �� ����
	
	public FlickeringLabel(String text, long delay) {
		
		super(text);		//JLable������ ȣ��
		this.delay = delay;
		setOpaque(true);	//���� ������ �����ϵ��� ����
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
		setTitle("FlickeringLabel����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("����", 500);
		
		JLabel label = new JLabel("�ȱ���");
		
		FlickeringLabel fLabel2  = new FlickeringLabel("���⵵ ����", 300);
		
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
