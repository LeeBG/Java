package ch06;

public class Wrapper01 {
	public static void main(String[] args) {
		int num = 10;			//4바이트 공간에 할당
		Integer num2 = 10;		//레퍼런스 변수 - 주소
		
		String num3 =num2.toString();	//toString은 모든 오브젝트를 문자로 바꿈
		System.out.println(num3);
		
		
//		String num4 = num +"";// 방법1
		String num5 = "10";
		int num6 = Integer.parseInt(num5);		//자주쓰는 함수라 static으로 만들어서 new하지 않아도 됨
		System.out.println(num6);
	}
}
