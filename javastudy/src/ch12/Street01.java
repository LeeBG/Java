package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street01 extends JFrame{

	private int x =350;
	private int y = 20;
	private Container c;
	
	public Street01() {
		setTitle("스트리트 파이터 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,300);
		setLocationRelativeTo(null);//모니터 정중앙에 JFrame 배치
		c= getContentPane();
		c.add(new GamePanel());
		setVisible(true);
	}
	class GamePanel extends JPanel{
		private ImageIcon imgIconPlayer,imgIconJang;
		private Image imgPlayer,imgjang;
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgjang = imgIconJang.getImage();
			
			//포커스가 맞지 않는다.
			setFocusable(true);		//포커스를 강제로 주는 방법
			
			addKeyListener(new KeyAdapter() {	//keyListener와 달리 불필요한 메서드 강제성없음
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(x>=350 && x<=660) {
						if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
							x=x+10;
							System.out.println("x좌표: "+x);
						}
						else if(e.getKeyCode()==KeyEvent.VK_LEFT){
							x-=10;
							System.out.println("x좌표: "+x);
						}
						else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
							int i=0;
							while(x<=660) {	
								try {
									i++;
									x+=10;
									Thread.sleep(30);	
									paintComponent(getGraphics());
								} catch (Exception e1) {
									System.err.println("잘못됨");
								}repaint();
							}
						}
						repaint();
					}else {
						if(x<350)
							x+=10;
						else if(x>660)
							x-=10;
						repaint();
					}
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer,0,0,null);
			g.drawImage(imgjang,x,y,null);
		}
	}
	public static void main(String[] args) {
		new Street01();

	}

}
