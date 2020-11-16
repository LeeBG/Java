package quiz;

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
		System.out.println("("+x+","+y+")"+"���� ũ�Ⱑ "+width+" x "+height+"�� �簢��");
	}
	boolean contains(Rectangle r) {
		return (this.height+this.y > r.height+r.y)&&(this.width+this.x > r.width+r.y)&&(this.x<r.x)&&(this.y<r.y);
	}
}
