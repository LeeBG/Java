package coffee;

// ��
// å�� : �޴� �ֹ�() , �Ա�
public class Customer {

	public void order(Barista b1) {
		//�ֹ�
		//�ٸ���Ÿ���� �޽����� ������.	(�Լ��� ȣ���Ѵ�.)
		Coffee c = b1.makeCoffee();	//å���� ������.
		System.out.println(c.getName()+"�� ���Խ��ϴ�.");
	}
	public void eat(Coffee c) {
		System.out.println(c.getName()+"�� �Ծ����ϴ�.");
	}
}
