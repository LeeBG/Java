package star1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Tank extends StarUnit{
	public Tank() {
		setName("��ũ");
		setAttack(30);
		setHp(150);
	}
	public void upgrade() {			//����
		setAttack(getAttack()+2);
		System.out.println(getName()+" ���׷��̵� �Ϸ�! attack :"+getAttack());
		System.out.println("=====================");
	}
}
