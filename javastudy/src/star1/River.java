package star1;

class River extends StarUnit{
	//상태
								//final 은 상수를 의미한다 메모리 공간을 읽기 전용으로 바꾼다.
								//처음 들어온 값에서 변경 불가능

//	초기화를 위한 생성자
	public River() {
		setName("리버");
		setAttack(80);
		setHp(150);
	}
	
	// 초기화를 위한 생성자를 만들었다면 default생성자를 직접 만들어준다 (컴파일러가 생성x)

	
	//변수의 값을 변경하거나 확인하는 행위가 필요함(getter setter)
	
	public void upgrade() {			//업글
		setAttack(getAttack()+5);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
	
}
