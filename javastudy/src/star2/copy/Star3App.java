package star2.copy;

public class Star3App {

	//Zealot Dragon Tank SCV DarkTempler => StarUnit
	public static void unitInfo(StarUnit u) {			//���� ����(�޼ҵ�=�Լ�) public = Ŭ���� �ܺο��� ��������
		System.out.println("�����̸�:"+u.getName());
		System.out.println("����ü��:"+u.getHp());
		System.out.println("���ְ��ݷ�:"+u.getAttack());
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		River r = new River();
		Dragoon d = new Dragoon();
		Zealot z = new Zealot();
		r.attack(d);
		d.attack(r);
		r.attack(d);
		r.upgrade();
		r.attack(z); 
		unitInfo(r);
		unitInfo(z);
		unitInfo(d);
		
	}

}
