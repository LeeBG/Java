package review;

// 자바는 함수만 만들수가 없다.
// 더하기 함수를 만들고 싶음. -> 더하기 함수 만들려면 클래스가 필요함.

//class A{		//함수만 만들고 싶어도 클래스에 담아야 한다.
//	void add() {
//		System.out.println("더하기");
//	}			//클래스 A는 상태가 없는데 함수로 상태를 변화시켜야한다? 말이 안됨
//}

interface A{		//자바에서는 메서드만 하나 만들고 싶으면 인터페이스로 만듦
	void add();
}

class 운동선수 {
	int 근육량=10;
	void 벌크업() {
		근육량= 근육량+30;
	}
}

public class Ex121 {
	public static void main(String[] args) {
		System.out.println("더하기");
		//인터페이스로 익명클래스 (함수 구현되어야 함)를 만들수 있다!!
		new A() {
			
			@Override
			public void add() {			//상태가 없기 때문에 한번 쓰고 버림
				System.out.println("더하기");
			}
		}.add();
	}
}
