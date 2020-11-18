package star1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Tank extends StarUnit{
	public Tank() {
		setName("탱크");
		setAttack(30);
		setHp(150);
	}
	public void upgrade() {			//업글
		setAttack(getAttack()+2);
		System.out.println(getName()+" 업그레이드 완료! attack :"+getAttack());
		System.out.println("=====================");
	}
}
