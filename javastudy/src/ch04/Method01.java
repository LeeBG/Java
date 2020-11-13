package ch04;

//자바 특징 : 모든 코드는 class 내부에 둬야 한다.[규칙]

public class Method01 {
	static void add() {	//static은 클래스마다 공간이 따로 있음
		System.out.println("add함수 호출 됨");
	}
	void sound() {
		System.out.println("sound함수 호출 됨");
	}
	public static void main(String[] args) {
		Method01.add();				
		
		Method01 m1 = new Method01();	//Static이 없음 heap메모리에 뜸
		m1.sound();
	}
}//end of Method01
