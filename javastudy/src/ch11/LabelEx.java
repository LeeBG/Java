package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{

	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		//맨위 0맨 왼쪽부터 채움
		//문자열 레이블 생성
		JLabel textlabel = new JLabel("사랑합니다");
		
		//이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");	//이미지 로딩
		JLabel imageLabel = new JLabel(beauty);		//이미지 레이블 생성
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");	//이미지 로딩
		JLabel label = new JLabel("보고 싶으면 전화하세요.",normalIcon,SwingConstants.CENTER);
		//레이블 생성 (문자열,이미지,수평 정렬값)
		
//		컨텐트팬에 3개 레이블 부착
		c.add(textlabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(700,600);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new LabelEx();

	}

}
