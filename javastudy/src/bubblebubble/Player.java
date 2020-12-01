package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//하나의 이미지 오브젝트
public class Player extends JLabel { // label

	public Player player = this;
	private static final String TAG = "Player: ";
	public ImageIcon icPlayerR, icPlayerL; // 오른쪽보는 이미지 왼쪽 보는 이미지
	public int x = 55; // 이 라벨의 좌표
	public int y = 535; // 이 라벨의 좌표
	//상태
	public boolean isRight = false;		//오른쪽으로 움직이는지 아닌지의 상태
	public boolean isLeft = false;		//왼쪽으로 움직이는지 아닌지의 상태
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1;		//1.535, 2.415, 3.295, 4.175 
	
	public Player() {

		icPlayerR = new ImageIcon("images/playerR.png");
		icPlayerL = new ImageIcon("images/playerL.png");
		setIcon(icPlayerR);// 최초 R보기
		setSize(50, 50);
		setLocation(x, y);
	}

	public void moveRight() {
		
		System.out.println(TAG+"moveRight");	
		
		if(isRight == false) {
			new Thread(new Runnable() {			
				@Override
				public void run() {		//스레드가 시작될 때
					setIcon(icPlayerR);// 최초 R보기
					isRight= true;
					while(isRight) {
						x++;
						setLocation(x, y);//setLocation은 내부적으로 repaint()메서드가 존재함
						System.out.println("x: "+x+"y: "+y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//왜 동작을 안할까?
						//moveRight가 종료되어야 repaint됨
					}	
				}
			}).start();
		}
		
		
		
	}
	public void moveLeft() {
		System.out.println(TAG+"moveLeft");
		if(isLeft == false) {
			setIcon(icPlayerL);// 최초 R보기
			new Thread(new Runnable() {			
				@Override
				public void run() {		//스레드가 시작될 때
					isLeft= true;
					while(isLeft) {
						x--;
						setLocation(x, y);//setLocation은 내부적으로 repaint()메서드가 존재함
						System.out.println("x: "+x+"y: "+y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//왜 동작을 안할까?
						//moveRight가 종료되어야 repaint됨
					}	
				}
			}).start();;
		}
		
	}
	
	public void moveUp() {
		System.out.println(TAG+"moveUp");
		if(isUp==false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					isUp = true;
						for(int i=0;i<120;i++) {
							y--;
							setLocation(x, y);//setLocation은 내부적으로 repaint()메서드가 존재함
							try {
								Thread.sleep(5);
							} catch (Exception e) {
								e.printStackTrace();
							}
							//왜 동작을 안할까?
							//moveRight가 종료되어야 repaint됨
						}
						moveDown();
				}
			}).start();
		}	
	}
	public void moveDown() { //떨어지는 
		System.out.println(TAG+"moveDown");
		if(isDown==false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					isDown = true;
					for(int i=0;i<120;i++) {
						y++;
						setLocation(x, y);//setLocation은 내부적으로 repaint()메서드가 존재함
						if(floor==1 /*빈 공 간x 좌표*/&& y > 535 ) {
							isDown=false;
							isUp=false;
							break;
						}
						try {
							Thread.sleep(5);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//왜 동작을 안할까?
						//moveRight가 종료되어야 repaint됨
					}
					isDown=false;
					isUp=false;
				}
			}).start();
		}	
	}
	
	public void attack() {	//공격 >> 구현안함
		System.out.println(TAG+"attack");
	}
	public void moveJump() {
		moveUp();
		moveDown();
	}
	

}
