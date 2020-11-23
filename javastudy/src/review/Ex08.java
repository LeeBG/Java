package review;

//메서드와 매개변수 인수 

public class Ex08 {
	void add(int n1, int n2) { 	// void return 이 없다 ()는 함수라는 뜻 n1 n2 는 매개변수(arguments)
		System.out.println(n1 + n2);
	}

	int minus(int n1, int n2) {
		return n1 - n2;			//함수를 호출한 문장의 값이 n1-n2로 변경됨.
	}

	public static void main(String[] args) {
		Ex08 e = new Ex08();
		// 3과 6을 인수라고 한다.
		e.add(3, 6);// 함수의 호출(11번 라인에서 6번라인으로 점프)
		int result = e.minus(10, 5);
		System.out.println(result);
	}
}
