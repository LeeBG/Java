package star1;

class Zealot extends StarUnit{
	
	//규칙 : 클래스를 생성하면 무조건 초기화를 위한 생성자를 만든다.
	public Zealot() {
		setName("질럿");
		setAttack(16);
		setHp(100);
	}
	public void upgrade() {			//업글
		setAttack(getAttack()+1);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
}
