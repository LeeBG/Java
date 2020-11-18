package star2.copy;

class River implements StarUnit{

	private String name;
	private int hp;
	private int attack;
	
	
//	�ʱ�ȭ�� ���� ������
	public River() {
		this("����",150,80);
	}
	
	public River(String name, int hp, int attack) {
	this.name = name;
	this.hp = hp;
	this.attack = attack;
}
	


	// �ʱ�ȭ�� ���� �����ڸ� ������ٸ� default�����ڸ� ���� ������ش� (�����Ϸ��� ����x)

	
	//������ ���� �����ϰų� Ȯ���ϴ� ������ �ʿ���(getter setter)
	
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

	
	public void attack(StarUnit u) {			//���� ����(�޼ҵ�=�Լ�) public = Ŭ���� �ܺο��� ��������
		System.out.println(this.getName()+" -> "+u.getName()+" ����");
		u.setHp(u.getHp()-this.getAttack());
									
		if(u.getHp()>0) {		//�ĸ°� ü���� ������ ��
			System.out.println(u.getName()+" hp:" + u.getHp());
			System.out.println("=====================");
		}
		else {
			u.setHp(0);			//�ĸ°� ü���� ���� �� ���� ü�� 0
			System.out.println(u.getName()+" hp:" + u.getHp());
			dead(u);			//��� ó�� �Լ�
		}
	}
	public void upgrade() {
		this.setAttack(getAttack()+5);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
	
	public void dead(StarUnit u) {			//��� ó��
		System.out.println("==== "+u.getName()+" ��� ====");
		u = null;
	}

	
	
}
