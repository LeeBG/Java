package review;
//OOP는 실제 세상을 모방한 게 아님
//클래스와 오브젝트 인스턴스 차이

abstract class 가구 {		//추상 클래스		class 설계도 = new X = Object X
	
	
}
class 침대 extends 가구{	//실제 존재할 수 있다	class 설계도 = new O = Object O
	
}

public class Ex10 {

		침대 s = new 침대(); //heap공간에 침대가 메모리에 뜸(인스턴스)
}
