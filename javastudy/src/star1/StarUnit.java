package star1;

public class StarUnit {			//�θ� Ŭ���� 
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
		this.setAttack(getAttack()+1);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
	
	public void dead(StarUnit u1) {			//��� ó��
		System.out.println("==== "+u1.getName()+" ��� ====");
		u1 = null;
	}
}
