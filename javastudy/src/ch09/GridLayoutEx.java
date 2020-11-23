package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("Grid Layout Sample");
		//X��ư Ŭ���ϸ� Main�� ����� while�� ��� ���� �ʴ´�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		Container c = getContentPane();
		JPanel jp = new JPanel();
		JPanel jp2 = new JPanel();
		
		c.add(jp);
		c.add(jp2,BorderLayout.SOUTH);
		jp.setLayout(grid);
		jp.add(new JLabel(" �̸�"));
		jp.add(new JTextField(""));
		jp.add(new JLabel(" �й�"));
		jp.add(new JTextField(""));
		jp.add(new JLabel(" �а�"));
		jp.add(new JTextField(""));
		jp.add(new JLabel(" ����"));
		jp.add(new JTextField(""));
		jp2.setLayout(new BorderLayout());
		jp2.add(new JButton("��ư"));
		setSize(300,250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
