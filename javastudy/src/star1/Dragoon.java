package star1;

class Dragoon extends StarUnit{
	public Dragoon() {
		setName("���");
		setAttack(20);
		setHp(120);
	}
	
	public void upgrade() {			//����
		setAttack(getAttack()+2);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
}
