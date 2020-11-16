package star1;

class River {
	//상태
	String name;			//final 은 상수를 의미한다 메모리 공간을 읽기 전용으로 바꾼다.
								//처음 들어온 값에서 변경 불가능
	int hp;
	int attack;
//	초기화를 위한 생성자
	public River(String n,int h,int a) {
		name = n;
		hp = h;
		attack = a;
	}
	
	// 초기화를 위한 생성자를 만들었다면 default생성자를 직접 만들어준다 (컴파일러가 생성x)
	public River() {
	}
	
	//변수의 값을 변경하거나 확인하는 행위가 필요함(getter setter)
	
	
	
}
