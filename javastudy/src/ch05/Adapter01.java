package ch05;

interface Knife{	//칼 
	void 요리();
//	default void  상해() {};			//default를 붙이면 강제성이 없어지고 
	void  상해();						//interface내의 함수 정의 할 수 있음
}
//어댑터 용도 : 인터페이스 거르는 용도
abstract class 요리사Adapter implements Knife{
	public void 상해() {}
}

class 백종원 extends 요리사Adapter{
	@Override
	public void 요리() {
		// TODO Auto-generated method stub	
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}
}
