package star2.copy;

class River implements StarUnit{

	private String name;
	private int hp;
	private int attack;
	
	
//	초기화를 위한 생성자
	public River() {
		this("리버",150,80);
	}
	
	public River(String name, int hp, int attack) {
	this.name = name;
	this.hp = hp;
	this.attack = attack;
}
	


	// 초기화를 위한 생성자를 만들었다면 default생성자를 직접 만들어준다 (컴파일러가 생성x)

	
	//변수의 값을 변경하거나 확인하는 행위가 필요함(getter setter)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	public void attack(StarUnit u) {			//공격 행위(메소드=함수) public = 클래스 외부에서 쓸수있음
		System.out.println(this.getName()+" -> "+u.getName()+" 공격");
		u.setHp(u.getHp()-this.getAttack());
									
		if(u.getHp()>0) {		//쳐맞고 체력이 남았을 때
			System.out.println(u.getName()+" hp:" + u.getHp());
			System.out.println("=====================");
		}
		else {
			u.setHp(0);			//쳐맞고 체력이 없을 때 최저 체력 0
			System.out.println(u.getName()+" hp:" + u.getHp());
			dead(u);			//사망 처리 함수
		}
	}
	public void upgrade() {
		this.setAttack(getAttack()+5);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
	
	public void dead(StarUnit u) {			//사망 처리
		System.out.println("==== "+u.getName()+" 사망 ====");
		u = null;
	}

	
	
}
