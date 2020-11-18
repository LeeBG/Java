package star1;

/**
 * @author dita_808
 *
 */
class Marine extends StarUnit{

	public Marine() {
		setName("마린");
		setHp(40);
		setAttack(5);
	}
	public void upgrade() {			//업글
		setAttack(getAttack()+1);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
	   
}
