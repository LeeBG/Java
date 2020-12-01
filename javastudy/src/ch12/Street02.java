package ch12;


import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.BreakIterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import lombok.Data;
@Data
public class Street02 extends JFrame {

	private int x = 350;
	private int y = 20;
	private Container c;
	private boolean isRunning;		//while 제어 
	
	public Street02() {
		setTitle("스트리트 파이터 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 300);
		setLocationRelativeTo(null);// 모니터 정중앙에 JFrame 배치
		c = getContentPane();
		c.add(new GamePanel());
		setVisible(true);
	}

	class GamePanel extends JPanel {
		private ImageIcon imgIconPlayer, imgIconJang;
		private Image imgPlayer, imgjang;
		private JButton btn;
		
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgjang = imgIconJang.getImage();
			btn = new JButton("멈춤");
			isRunning = true;
			add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning=!isRunning;
				}
			});
			// 포커스가 맞지 않는다.
			setFocusable(true); // 포커스를 강제로 주는 방법

			addKeyListener(new KeyAdapter() { // keyListener와 달리 불필요한 메서드 강제성없음

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("X좌표 : " + x);// 340 ~ 640

					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {

							@Override
							public void run() {
								while(true) {
									System.out.println("");
									while (isRunning && x<660) {	//스레드는 힙변수를 공유할 수 있다.
										x += 2;
										repaint();
										try {
											Thread.sleep(2);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										
									}
								}
							}
						}).start();
					}
				}
			});

			
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgjang, x, y, null);
		}
	}

	public static void main(String[] args) {
		new Street02();

	}

}
