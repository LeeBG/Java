package star1;

public class StarUnit {			//부모 클래스 
	private String name;
	private int attack;
	private int hp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
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
		this.setAttack(getAttack()+1);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
	
	public void dead(StarUnit u1) {			//사망 처리
		System.out.println("==== "+u1.getName()+" 사망 ====");
		u1 = null;
	}
}
