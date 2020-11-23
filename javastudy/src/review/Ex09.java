package review;
//stack 과 지역변수

public class Ex09 {
//	스택 : 함수마다 가지고 있음
//	오픈 : 함수의 호출시
	int add() {	//함수 내부 = 중괄호{} 내부 ={} = stack이 오픈된다고 함.(함수를 호출할 때)
					//stack이 오픈됐지만, 메모리가 활성화 됐다는 게 아님.	
		int n1 =10;	//이 때 stack에 4byte가 할당이 됨. add()함수 stack에 할당됨
		return n1;
	}//함수종료 => 점프 후 복귀 = stack이 사라짐. = 변수가 지역적 = 지역변수
	
	public static void main(String[] args) {
		Ex09 e = new Ex09();
		e.add();		//n1이 메모리에 떠있음.
	}
}
