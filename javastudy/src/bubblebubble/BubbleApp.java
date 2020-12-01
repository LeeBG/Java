package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable{	//강제성 부여를 위한 Initable
	
	//컨텍스트 저장
	private BubbleApp bubbleApp = this; //Context를 쓰든 말든 항상 선언
	//태그
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
		setTitle("버블 버블");
		System.out.println(TAG+"이 부분이 실행 되나");//태그 활용법
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,639);
		setLayout(null);
		setContentPane(laBackground);
		
	}
	@Override
	public void batch() {
		add(player);		//생략가능
	}
	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.moveRight();		//메시지 호출, 책임 협력 => OOP프로그램
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.moveLeft();		//메시지 호출, 책임 협력 => OOP프로그램
				}else if(e.getKeyCode()==KeyEvent.VK_UP) {
					player.moveUp();		//메시지 호출 , 책임 협력 => OOP프로그램
				}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					player.moveDown();
				}else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					player.moveJump();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.isRight=false;//메시지 호출, 책임 협력 => OOP프로그램
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.isLeft=false;
				}
			}
			
		});
	}
}
