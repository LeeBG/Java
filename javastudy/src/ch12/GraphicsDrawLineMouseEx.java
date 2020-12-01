package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineMouseEx() {
		setTitle("draeing Line by mouse ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	class MyPanel extends JPanel{
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			//Mouse �����ʸ� ����Ѵ�.
			//�� �����ʴ� ���콺 ��ư�� �������� ���������� vStart���Ϳ� �����ϰ�
			//���콺 ��ư�� �������� ���콺 ������(����)�� vEnd ���Ϳ� ����Ѵ�.
			
			addMouseListener(new MouseAdapter() {		//MouseAdpater >> �߻�Ŭ����
				@Override
				public void mousePressed(MouseEvent e) {		//���콺�� Ŭ��������
					Point startP = e.getPoint();	//���콺 �����͸� �˾Ƴ���.
					vStart.add(startP);				//������ ������ ���Ϳ� startP�� ����
				}
				@Override
				public void mouseReleased(MouseEvent e) {		//���콺�� Ŭ���� Ǯ���� ��
					Point endP = e.getPoint(); //���콺 �����͸� �˾Ƴ���.
					vEnd.add(endP);				//�� ���� vEnd�� �����Ѵ�.
					
					//�г� �ٽ� �׸��⸦ ��û�Ѵ�.
					repaint();
				}
			});//anpnymous class end
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			
			//������ ũ�� ��ŭ ������ ���鼭 ���� �׸���.
			for(int i=0; i<vStart.size();i++) {		//vStart ������ ũ��� ������� ���� ������ ����
				Point s = vStart.elementAt(i);		//���Ϳ� ����ִ� �������� �˾Ƴ���.
				Point e = vEnd.elementAt(i);		//���Ϳ� ����ִ� ������ �˾Ƴ���.
				
				//���������� �������� ���� �׸���.
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				
			}//for end
		}//paintComponent end
	}//MyPanel end
}//class end
