package ch05;

class Father{
	int money = 10000;
//	1. 재산을 물려받는 의미(콤포지션을 해야함)
	
}
class Son extends Father{
//	아버지 아들 관계는 다형성 성립 안됨
	int money = 20000;
	
}

public class Inherit01 {
	public static void main(String[] args) {
		Son s = new Son();		//s는 Father을 가리킨다. 생성자는 자식Son
		//힙이 두 개가 뜸 
		System.out.println(s.money);		//변수를 찾을 때 자식에게 없다면 부모로 타고 올라가서 찾음
//		1번 변수를 찾을 때 변수가 있으면 그 변수를 사용 변수가 없으면 부모를 찾아올라감
		
		Father f = new Son();
//		2번 new를 하면 Father과 Son이 힙에 뜬다.
//		생성자는 Son()만 호출이 된다.
//		가리키는 메모리 주소는 타입을 따라간다.
		System.out.println(f.money);
	}
}
