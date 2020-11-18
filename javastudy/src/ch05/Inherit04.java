package ch05;

//�������̽� ����
//����� ����� ��
//�ڵ��� ����


//interface �� new �� �� ���� : �ֳ��ϸ� �߻�޼���(body�� ����)�� ������ ����!!
interface Animal2{
	void sound();		//�߻� �޼��� (�Լ��� ��ü�� ����)
	
}						

class Dog2 implements Animal2{
	//�ݵ�� sound��� �޼��带 �����ؾ��Ѵ�.(������)

	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
		
	}
}

class Bird2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("±±");
	}
}
class Tiger2 implements Animal2{
	@Override
	public void sound() {
		System.out.println("����");
	}
}
// Monkey Ŭ������ ����� (����) ����ϰ� 
// �ݵ�� Animal2�� �����ϼ���.				//Ÿ������ ������ �������̵� ����	�ڽ���  new�ϸ� ���̶�
class Monkey implements Animal2{
	public void sound() {
		System.out.println("����");
	}
}
public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	public static void main(String[] args) {
		//�ڱ� �ڽ��� Ŭ������ static�� ȣ���� ���� Ŭ������ ���� ����.
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey());
	}
}
