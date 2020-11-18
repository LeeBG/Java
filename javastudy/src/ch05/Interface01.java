package ch05;
//1.인터페이스는 new할 수 없다.
//2.인터페이스는 변수를 가질 수 있다.
//3.인터페이스는 추상 메서드를 가진다.
//4.인터페이스는 정상적인 메서드를 가질수 없다.
//5.인터페이스는 구현하는 클래스는 반드시 오버라이딩 해야한다.

interface Remocon{
	String name = "리모컨";	//변수에는 public static final 이 생략돼있다. static이 아니면 참고할 수 없다.
							//(public)외부에서 찾을 수 있으나 final(상수)이기 때문에 수정은 불가능 하다.
	public abstract void control();		//추상 메서드는 public을 가짐 
}
public class Interface01 {
	
	final static String name ="리모컨";				//일반적인 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
