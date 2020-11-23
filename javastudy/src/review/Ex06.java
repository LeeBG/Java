package review;

public class Ex06 {

	public static void main(String[] args) {
		int n1 = 100;
		double n2 = n1;		//upcasting (묵시적 형변환)
		//4바이트를 8바이트에 담는다. 작은데이터가 큰 공간에 들어가기 때문에 명시x해도 됩니다.
		double n3 = 10.5;
//		int n4 = n3;		//바로 담을 수 없다. 이유: 8바이트데이터를 4바이트에 담으려하기 때문에 안됨 
		int n4 = (int)n3;	//다운 캐스팅 (명시적 형변환)
		//특징 내 데이터가 유실될 수 있음
		System.out.println(n4);		//0.5 데이터 유실 
	}
}
