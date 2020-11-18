package star1;

class Dragoon extends StarUnit{
	public Dragoon() {
		setName("드라군");
		setAttack(20);
		setHp(120);
	}
	
	public void upgrade() {			//업글
		setAttack(getAttack()+2);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
}
