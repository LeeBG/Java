package star1;

class DarkTempler extends StarUnit{
	public DarkTempler() {
		setName("다크 템플러");
		setAttack(40);
		setHp(100);
	}
	public void upgrade() {			//업글
		setAttack(getAttack()+1);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
}
