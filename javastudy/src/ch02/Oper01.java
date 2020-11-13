package ch02;

public class Oper01 {

	public static void main(String[] args) {
		
		System.out.println(1+1);
		System.out.println(1+"1");
		
		int num = 10;
		String s = "5";
		
		String sum = num +s;//Type이 String으로 됨.
		System.out.println(sum);
		
		System.out.println(10-5);
		System.out.println(10/3); //타입이 int 둘다 int이기 때문
		
		System.out.println(10.0/3);	//double / int 이므로 결과는 타입이 큰 쪽으로 변함
		System.out.println(10%3); 	//정수 나머지 연산
		System.out.println(10*3);	//곱
	}//end of main
}//end of oper01 class
