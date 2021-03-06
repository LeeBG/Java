package quiz;


// P.242 4번문제
public class Rectangle {
	int x,y,width,height;
	
	public Rectangle(int x,int y,int width,int height) {
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
	}
	
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("("+x+","+y+")"+"에서 크기가 "+width+" x "+height+"인 사각형");
	}
	boolean contains(Rectangle r) {
		return (this.height+this.y > r.height+r.y)&&(this.width+this.x > r.width+r.y)&&		//우측 끝지점
				(this.x<r.x)&&(this.y<r.y);													//좌측시작지점
	}
}
