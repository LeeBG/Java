package star1;

/**
 * @author dita_808
 *
 */
class Marine extends StarUnit{

	public Marine() {
		setName("����");
		setHp(40);
		setAttack(5);
	}
	public void upgrade() {			//����
		setAttack(getAttack()+1);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
	   
}
