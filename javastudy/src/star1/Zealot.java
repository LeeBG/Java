package star1;

class Zealot extends StarUnit{
	
	//��Ģ : Ŭ������ �����ϸ� ������ �ʱ�ȭ�� ���� �����ڸ� �����.
	public Zealot() {
		setName("����");
		setAttack(16);
		setHp(100);
	}
	public void upgrade() {			//����
		setAttack(getAttack()+1);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
}
