package star1;

class River extends StarUnit{
	//����
								//final �� ����� �ǹ��Ѵ� �޸� ������ �б� �������� �ٲ۴�.
								//ó�� ���� ������ ���� �Ұ���

//	�ʱ�ȭ�� ���� ������
	public River() {
		setName("����");
		setAttack(80);
		setHp(150);
	}
	
	// �ʱ�ȭ�� ���� �����ڸ� ������ٸ� default�����ڸ� ���� ������ش� (�����Ϸ��� ����x)

	
	//������ ���� �����ϰų� Ȯ���ϴ� ������ �ʿ���(getter setter)
	
	public void upgrade() {			//����
		setAttack(getAttack()+5);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
	
}
