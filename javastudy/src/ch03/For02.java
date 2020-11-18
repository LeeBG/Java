package ch03;

public class For02 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%2==0 && i>0) {		//2로나눈 나머지가 0 이면서 0보다는 큰 자연수
									//비교연산자 + 논리연산자 && 사용
				System.out.println("짝수 : "+i);
			}
		}

		for (int i = 0; i < 100; i++) {
			if(i%2==1 && i>0) {		//2로나눈 나머지가 1 이면서 0보다는 큰 자연수
									//비교연산자 + 논리연산자 && 사용
				System.out.println("홀수 : "+i);
			}
		}
	}
}
