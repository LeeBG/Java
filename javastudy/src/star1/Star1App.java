package star1;

public class Star1App {

	// ���� - > ��� ����
	static void attack(Zealot u1, Dragoon u2) {	//attack�� ���� ���� (stack)
		System.out.println(u1.name+" -> "+u2.name+" ����");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	// ��� - > ���� ����
	static void attack(Dragoon u1, Zealot u2) {	//attack�� ���� ���� (stack)
		System.out.println(u1.name+" -> "+u2.name+" ����");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	
	// ��� - > ��� ����
	static void attack(Dragoon u1, Dragoon u2) {	//attack�� ���� ���� (stack)
		System.out.println(u1.name+" -> "+u2.name+" ����");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	static void attack(DarkTempler u1, Dragoon u2) {	//attack�� ���� ���� (stack)
		System.out.println(u1.name+" -> "+u2.name+" ����");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	static void attack(DarkTempler u1, Zealot u2) {	//attack�� ���� ���� (stack)
		System.out.println(u1.name+" -> "+u2.name+" ����");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z1 = new Zealot("����1", 100, 16); // z1�� main���� ��������
		Dragoon d1 = new Dragoon("���1", 120, 20); // d1�� ���������� ��������
		Dragoon d2 = new Dragoon("���2",120, 20);	
		DarkTempler dt1 = new DarkTempler("��ũ���÷�1", 100, 40);
		DarkTempler dt2 = new DarkTempler("��ũ���÷�2", 100, 40);
		
		//Overloading >> �Լ��̸��� ���Ƶ� �Ű������� Ÿ���̳� ������ �ٸ��ٸ� �Լ� ����(������)
		attack(z1, d1);
		attack(d1,z1);
		attack(d1, d2);
		
		//��ũ ���÷�1 ���� 1�� ����
		attack(dt1,z1);
		//��ũ ���÷�2 ��� 1�� ����
		attack(dt2,d1);
		System.out.println();

	}

}
