package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		//이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedcherry.jpg");
		
		//3개의 체크박스 생성
		JCheckBox apple  = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		
		cherry.setBorderPainted(true); 		//체리의 외각선이 보이도록 설정
		cherry.setSelectedIcon(selectedcherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
