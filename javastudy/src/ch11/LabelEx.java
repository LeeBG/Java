package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{

	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		//���� 0�� ���ʺ��� ä��
		//���ڿ� ���̺� ����
		JLabel textlabel = new JLabel("����մϴ�");
		
		//�̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");	//�̹��� �ε�
		JLabel imageLabel = new JLabel(beauty);		//�̹��� ���̺� ����
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");	//�̹��� �ε�
		JLabel label = new JLabel("���� ������ ��ȭ�ϼ���.",normalIcon,SwingConstants.CENTER);
		//���̺� ���� (���ڿ�,�̹���,���� ���İ�)
		
//		����Ʈ�ҿ� 3�� ���̺� ����
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
