package ch03;

public class If01 {

	public static void main(String[] args) {
		
		//표현식 : 그 라인에 걸리면 내부스택이 바로 실행됨. 항상 조건식이 참이돼야 실행이 된다.
		if(true) {
			System.out.println("true입니다.");
		}
		
		//빨간색 에러 표시는 컴파일에러가 뜨고 노란색 코드는 쓸 데 없다는 코드
//		if(false) {		//애초에 실행이 안되는 데드코드 왜냐하면 조건식이 참일 때 실행이 되기 때문
//			
//		}
		int num =0;
		if(num > 1) {		//비교연산자 사용 > 1보다 클 때
			System.out.println("num은 1보다 큽니다");
		}else {
			System.out.println("num은 1보다 작습니다.");
		}
		
		int sum = 20;
		if (sum ==10) {
			System.out.println("sum은 10입니다.");
		}else if (sum ==20) {
			System.out.println("sum은 20입니다.");
		}else{
			System.out.println("sum은 30입니다.");
		}
	}

}
