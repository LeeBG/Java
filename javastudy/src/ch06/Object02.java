package ch06;

public class Object02 {

	
//	static void test(Object num) {
//		int money = 10000;
//		int sum = money + (int)num;
//	}
	public static void main(String[] args) {
//		Object num =10;
//		test(num);
		String str = "홍길동";
		System.out.println(str.hashCode());		//주소를 비교할 수 있음
												//힙영역을 비교할 수 있다.
												//Object가 가지고 있기때문에 모든곳에서 사용가능
		
		String str2 = "홍길동";
		System.out.println(str2.hashCode());
		
		str = "임꺽정";
		System.out.println(str.hashCode());
	}
}
