package star1;

class DarkTempler extends StarUnit{
	public DarkTempler() {
		setName("��ũ ���÷�");
		setAttack(40);
		setHp(100);
	}
	public void upgrade() {			//����
		setAttack(getAttack()+1);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
}
