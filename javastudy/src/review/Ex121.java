package review;

// �ڹٴ� �Լ��� ������� ����.
// ���ϱ� �Լ��� ����� ����. -> ���ϱ� �Լ� ������� Ŭ������ �ʿ���.

//class A{		//�Լ��� ����� �; Ŭ������ ��ƾ� �Ѵ�.
//	void add() {
//		System.out.println("���ϱ�");
//	}			//Ŭ���� A�� ���°� ���µ� �Լ��� ���¸� ��ȭ���Ѿ��Ѵ�? ���� �ȵ�
//}

interface A{		//�ڹٿ����� �޼��常 �ϳ� ����� ������ �������̽��� ����
	void add();
}

class ����� {
	int ������=10;
	void ��ũ��() {
		������= ������+30;
	}
}

public class Ex121 {
	public static void main(String[] args) {
		System.out.println("���ϱ�");
		//�������̽��� �͸�Ŭ���� (�Լ� �����Ǿ�� ��)�� ����� �ִ�!!
		new A() {
			
			@Override
			public void add() {			//���°� ���� ������ �ѹ� ���� ����
				System.out.println("���ϱ�");
			}
		}.add();
	}
}
