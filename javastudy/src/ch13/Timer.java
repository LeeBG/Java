package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerHour implements Runnable {
	private JLabel timerhour;
	LocalDateTime now = LocalDateTime.now();

	public TimerHour(JLabel timerhour) {
		this.timerhour = timerhour;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			int hour = now.getHour() + n;
			try {
				if(hour<60) {
					timerhour.setText(Integer.toString(hour)+":");
					Thread.sleep(3600000);
					n++;				
				}else {
					timerhour.setText(Integer.toString(hour)+":");
					Thread.sleep(3600000);
					hour=hour-24;			
					n++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}

class TimerMinute implements Runnable {
	private JLabel timerminute;
	LocalDateTime now = LocalDateTime.now();

	public TimerMinute(JLabel timerminute) {
		this.timerminute = timerminute;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			int minute = now.getMinute() + n;
			try {
				if(minute<60) {
					timerminute.setText(Integer.toString(minute)+":");
					Thread.sleep(60000);
					n++;
					
				}else {
					timerminute.setText(Integer.toString(minute)+":");
					Thread.sleep(60000);
					minute=minute-60;
					
					n++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}

class TimerSecond implements Runnable {
	private JLabel timersecond;
	LocalDateTime now = LocalDateTime.now();

	public TimerSecond(JLabel timersecond) {
		this.timersecond = timersecond;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			int second = now.getSecond()+n;
			try {
				if(second<60) {
					Thread.sleep(1000);
					n++;
					timersecond.setText(Integer.toString(second));
				}else {
					Thread.sleep(1000);
					second=second-60;
					timersecond.setText(Integer.toString(second));
					n++;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}

public class Timer extends JFrame {
	public Timer() {
		setTitle("timer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();

		JLabel timerhour = new JLabel();
		JLabel timerminute = new JLabel();
		JLabel timersecond = new JLabel();
		c.setLayout(new FlowLayout());

		timerhour.setFont(new Font("Gothic", Font.ITALIC, 60));
		timerminute.setFont(new Font("Gothic", Font.ITALIC, 60));
		timersecond.setFont(new Font("Gothic", Font.ITALIC, 60));
		c.add(timerhour);
		c.add(timerminute);
		c.add(timersecond);

		TimerHour runnableh = new TimerHour(timerhour);
		Thread th = new Thread(runnableh);
		TimerMinute runnablem = new TimerMinute(timerminute);
		Thread th2 = new Thread(runnablem);
		TimerSecond runnables = new TimerSecond(timersecond);
		Thread th3 = new Thread(runnables);

		setSize(400, 150);
		setVisible(true);

		th.start();
		th2.start();
		th3.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDateTime now =  LocalDateTime.now();
//		System.out.println(now.getHour());
//		System.out.println(now.getMinute());
//		System.out.println(now.getSecond());
		new Timer();
	}

}
