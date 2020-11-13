package ch04;

//메서드 안에 메서드를 정의할 수 없다.
//기존의 자료형 말고는 데이터를 담을 수 없다.
//변수에 메서드를 담을 수 없다. java script
public class Method04 {

	int money = 10000; // heap 전역변수 선언(int money)
	
	void add(int num) {	//stack (int num)
		money = money + num;
		
	}
	//ctrl + shift + Enter >> auto Formmat
	
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);
	}
}
