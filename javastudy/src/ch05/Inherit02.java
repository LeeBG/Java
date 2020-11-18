package ch05;

class 지구인{	//함수는 한글로 만드는 사람 많음
	String name = "지구인";
	
}
class 한국인 extends 지구인{		//확장하다.
	String name = "한국인";
}
class 부산인 extends 한국인{
	String name = "부산인";
}

// 다중 상속은 허용 x
public class Inherit02 {
	public static void main(String[] args) {
//		Heap (한국인, 지구인) -> 포인터 (지구인)
		지구인 b = new 한국인();	
//		한국인 h = b;		//b는 지구인을 가리키고 있다.
		
		지구인 d = new 한국인();
//		1. b는 한국인(자식), 지구인(부모)이 메모리에 다 있기 때문에
		한국인 f = (한국인)d;			//클래스에서의 다운 캐스팅(명시적 형 변환) 유전적 우위
		
		
//		
		try {
			부산인 busan =(부산인) b;		//컴파일은 되나, 메모리에 떠 있지 않기 때문에 오류(new를 안함)
		} catch (Exception e) {
			// 개발자가 핸들링 하는 부분(예외처리)
			System.out.println("오류가 발생했는데 무시해도 됨");
		}
		
		
		
		
	
		부산인 a = new 부산인();//HEAP 에 세 개 다들어감. 생성자()를 가짐
		
		
	}
}
