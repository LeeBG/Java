package ch04;

//�ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.[��Ģ]

public class Method01 {
	static void add() {	//static�� Ŭ�������� ������ ���� ����
		System.out.println("add�Լ� ȣ�� ��");
	}
	void sound() {
		System.out.println("sound�Լ� ȣ�� ��");
	}
	public static void main(String[] args) {
		Method01.add();				
		
		Method01 m1 = new Method01();	//Static�� ���� heap�޸𸮿� ��
		m1.sound();
	}
}//end of Method01
