package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable{	//������ �ο��� ���� Initable
	
	//���ؽ�Ʈ ����
	private BubbleApp bubbleApp = this; //Context�� ���� ���� �׻� ����
	//�±�
	private static final String TAG ="BubbleApp:";
	private JLabel laBackground;
	private Player player;
	
	public BubbleApp() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleApp();
		
	}


	@Override
	public void init() {		//new
		// TODO Auto-generated method stub
		laBackground = new JLabel(new ImageIcon("images/bg.png"));
		player = new Player();
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("���� ����");
		System.out.println(TAG+"�� �κ��� ���� �ǳ�");//�±� Ȱ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,639);
		setLayout(null);
		setContentPane(laBackground);
		
	}
	@Override
	public void batch() {
		add(player);		//��������
	}
	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.moveRight();		//�޽��� ȣ��, å�� ���� => OOP���α׷�
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.moveLeft();		//�޽��� ȣ��, å�� ���� => OOP���α׷�
				}else if(e.getKeyCode()==KeyEvent.VK_UP) {
					player.moveUp();		//�޽��� ȣ�� , å�� ���� => OOP���α׷�
				}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					player.moveDown();
				}else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					player.moveJump();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.isRight=false;//�޽��� ȣ��, å�� ���� => OOP���α׷�
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.isLeft=false;
				}
			}
			
		});
	}
}
