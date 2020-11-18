package ch05;

//인터페이스 정의
//약속을 만드는 값
//자동차 엑셀


//interface 는 new 할 수 없다 : 왜냐하면 추상메서드(body가 없는)를 가졌기 때문!!
interface Animal2{
	void sound();		//추상 메서드 (함수의 몸체가 없다)
	
}						

class Dog2 implements Animal2{
	//반드시 sound라는 메서드를 구현해야한다.(강제성)

	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("냐옹");
		
	}
}

class Bird2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
class Tiger2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("어흥");
	}
}
// Monkey 클래스를 만들고 (몽몽) 출력하고 
// 반드시 Animal2를 구현하세요.				//타입통일 무조건 오버라이딩 강제	자식을  new하면 같이뜸
class Monkey implements Animal2{
	public void sound() {
		System.out.println("몽몽");
	}
}
public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		//자기 자신의 클래스의 static을 호출할 때는 클래스명 생략 가능.
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey());
	}
}
