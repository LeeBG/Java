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
	private boolean isRunning;		//while ���� 
	
	public Street02() {
		setTitle("��Ʈ��Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 300);
		setLocationRelativeTo(null);// ����� ���߾ӿ� JFrame ��ġ
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
			btn = new JButton("����");
			isRunning = true;
			add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning=!isRunning;
				}
			});
			// ��Ŀ���� ���� �ʴ´�.
			setFocusable(true); // ��Ŀ���� ������ �ִ� ���

			addKeyListener(new KeyAdapter() { // keyListener�� �޸� ���ʿ��� �޼��� ����������

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("X��ǥ : " + x);// 340 ~ 640

					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {

							@Override
							public void run() {
								while(true) {
									System.out.println("");
									while (isRunning && x<660) {	//������� �������� ������ �� �ִ�.
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
