package ch06;

public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1==str2);
		
		int num = 10;
		//최초 엑세스한 메모리 공간의 내용을 비교
		String str3 = "임꺽정";				//Constant Pool
		String str4 = new String("임꺽정");	//Heap
//		실제비교하면 다르다 해쉬값은 같다.

		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3==str4);		//==은 주소비교 다른주소 false 출력
		
		System.out.println(str3.equals(str4));
		// == 으로 먼저 비교하고 같으면 끝
		// == 으로 비교했는데 false가 나오면 reference 최종목적지 값을 비교
		// 일반적으로 문자열비교는 .equals 쓰고 다른 타입들은 == 으로 비교
		//String의 Hash함수는 Overiding 돼서 같은 문자열이면 같은 해쉬를 뽑아낸다.
	}

}
