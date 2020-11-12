package ch02;
// 자바는 .class파일을 실행하면 static부분을 메모리에 로드한다.
// static 공간에 있는 main()함수를 찾아서 호출하고
// 이때 stack이 생성 되는 데 이 stack의 이름은 main이라고 한다.
// main이 stack 종료 되면 프로그램 종료!!

public class Var02 {
	public static void main(String[] args) {
		//code
		
		//정수형부분
		
		int num = 2147000000;	// 4byte - 32비트 범위 -21억 ~ 21억
		short num2=32111; 		//정수short형은 2byte
		long num3 = 10; 		//long type - 8byte 큰 숫자를 저장
		
		//문자
		char s = 'A';			//char - 2byte 영어와 한글 저장 가능 중국어(3바이트)불가
		
		//실수
		double d = 7.5;			//double - 8바이트 42억 (-21억 + 21억 ) 추가로 소수점이하 저장가능

		//참 거짓
		boolean b = true;		//1bit 참1 거짓0
		
		// 범위를 넘어가면 type int is out of range 에러 발생
		System.out.println(num);
		num=num2;				//[묵시적 형변환] 업캐스팅
								//반대로 큰 데이터 타입을 작은 데이터 타입에 넣는것은 안됨
		num2=(short)num;		//다운 캐스팅으로 가능
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
		num = (int)d;			//명시적 형변환 소수점 표현 불가능 type이기 때문에 데이터 손실
								//다운 캐스팅
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(b);
		
	}//end of main
}//end of class
