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
		setTitle("draeing Line by mouse 예제");
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
			//Mouse 리스너를 등록한다.
			//이 리스너는 마우스 버튼이 눌러지면 시작지점을 vStart벡터에 저장하고
			//마우스 버튼이 놓여지면 마우스 포인터(끝점)을 vEnd 벡터에 기억한다.
			
			addMouseListener(new MouseAdapter() {		//MouseAdpater >> 추상클래스
				@Override
				public void mousePressed(MouseEvent e) {		//마우스를 클릭했을때
					Point startP = e.getPoint();	//마우스 포인터를 알아낸다.
					vStart.add(startP);				//시작점 포인터 벡터에 startP를 저장
				}
				@Override
				public void mouseReleased(MouseEvent e) {		//마우스를 클릭을 풀었을 때
					Point endP = e.getPoint(); //마우스 포인터를 알아낸다.
					vEnd.add(endP);				//끝 점을 vEnd에 저장한다.
					
					//패널 다시 그리기를 요청한다.
					repaint();
				}
			});//anpnymous class end
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			
			//벡터의 크기 만큼 루프를 돌면서 선을 그린다.
			for(int i=0; i<vStart.size();i++) {		//vStart 벡터의 크기는 만들어진 선의 갯수와 동일
				Point s = vStart.elementAt(i);		//벡터에 들어있는 시작점을 알아낸다.
				Point e = vEnd.elementAt(i);		//벡터에 들어있는 끝점을 알아낸다.
				
				//시작점에서 끝점까지 선을 그린다.
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				
			}//for end
		}//paintComponent end
	}//MyPanel end
}//class end
