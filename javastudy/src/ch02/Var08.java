package ch02;

// heap
class Zealot{
	String name ="����";		//Static�� ó������ �߰�
	int attack = 10;
	int armor =5;
	static int hp = 100;
}

public class Var08 {
	 public static void main(String[] args) {
		 //
		 //
		 //
		 //
		 //
		 //
		 //
		Zealot z = new Zealot();	//static �� �Ⱥپ��ִ� �͵��� heap �޸𸮿� ��
		Zealot z2 = new Zealot();	//static �� �Ⱥپ��ִ� �͵��� heap �޸𸮿� ��
		System.out.println("----z1----");
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		z2.name="�߾�����";
		z2.attack=16;
		z2.armor=6;
		System.out.println("----z2----");
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack =50;		//�ٲ�� ���� zealot��� hp�� �ٲ��.
		
		System.out.println("z��ȭ ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp =50;
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//���� ���׷��̵�
		
		z.attack = 11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}
}
