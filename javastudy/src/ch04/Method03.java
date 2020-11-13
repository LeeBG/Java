package ch04;

class Cal {  // 계산기
	static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}

	static int minus(int n3, int n4) {

		return n3 - n4;
	}
	
	int mul(int n5, int n6) {
		return n5*n6;
	}

	void div(int n1, int n2) {

	}
}

public class Method03 {
	public static void main(String[] args) {

		Cal.add(5,6);
		Cal.minus(10, 4);
		
		//minus 함수는 return 타입이 int이기 때문에
		//Cal.minus(10,4)가 호출된 후 메서드가 종료되면 
		//Cal.minus(10,4) --> 6으로 변경된다.
		int result = Cal.minus(10, 4);
		System.out.println(result);
		
	}
}
