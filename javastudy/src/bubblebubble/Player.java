package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//�ϳ��� �̹��� ������Ʈ
public class Player extends JLabel { // label

	public Player player = this;
	private static final String TAG = "Player: ";
	public ImageIcon icPlayerR, icPlayerL; // �����ʺ��� �̹��� ���� ���� �̹���
	public int x = 55; // �� ���� ��ǥ
	public int y = 535; // �� ���� ��ǥ
	//����
	public boolean isRight = false;		//���������� �����̴��� �ƴ����� ����
	public boolean isLeft = false;		//�������� �����̴��� �ƴ����� ����
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1;		//1.535, 2.415, 3.295, 4.175 
	
	public Player() {

		icPlayerR = new ImageIcon("images/playerR.png");
		icPlayerL = new ImageIcon("images/playerL.png");
		setIcon(icPlayerR);// ���� R����
		setSize(50, 50);
		setLocation(x, y);
	}

	public void moveRight() {
		
		System.out.println(TAG+"moveRight");	
		
		if(isRight == false) {
			new Thread(new Runnable() {			
				@Override
				public void run() {		//�����尡 ���۵� ��
					setIcon(icPlayerR);// ���� R����
					isRight= true;
					while(isRight) {
						x++;
						setLocation(x, y);//setLocation�� ���������� repaint()�޼��尡 ������
						System.out.println("x: "+x+"y: "+y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//�� ������ ���ұ�?
						//moveRight�� ����Ǿ�� repaint��
					}	
				}
			}).start();
		}
		
		
		
	}
	public void moveLeft() {
		System.out.println(TAG+"moveLeft");
		if(isLeft == false) {
			setIcon(icPlayerL);// ���� R����
			new Thread(new Runnable() {			
				@Override
				public void run() {		//�����尡 ���۵� ��
					isLeft= true;
					while(isLeft) {
						x--;
						setLocation(x, y);//setLocation�� ���������� repaint()�޼��尡 ������
						System.out.println("x: "+x+"y: "+y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//�� ������ ���ұ�?
						//moveRight�� ����Ǿ�� repaint��
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
							setLocation(x, y);//setLocation�� ���������� repaint()�޼��尡 ������
							try {
								Thread.sleep(5);
							} catch (Exception e) {
								e.printStackTrace();
							}
							//�� ������ ���ұ�?
							//moveRight�� ����Ǿ�� repaint��
						}
						moveDown();
				}
			}).start();
		}	
	}
	public void moveDown() { //�������� 
		System.out.println(TAG+"moveDown");
		if(isDown==false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					isDown = true;
					for(int i=0;i<120;i++) {
						y++;
						setLocation(x, y);//setLocation�� ���������� repaint()�޼��尡 ������
						if(floor==1 /*�� �� ��x ��ǥ*/&& y > 535 ) {
							isDown=false;
							isUp=false;
							break;
						}
						try {
							Thread.sleep(5);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//�� ������ ���ұ�?
						//moveRight�� ����Ǿ�� repaint��
					}
					isDown=false;
					isUp=false;
				}
			}).start();
		}	
	}
	
	public void attack() {	//���� >> ��������
		System.out.println(TAG+"attack");
	}
	public void moveJump() {
		moveUp();
		moveDown();
	}
	

}
