package ch05;

class Animal{
	void sound() {}		//���� ���̵� : ����)��ȿȭ �ϴ�. [�θ��� �޼��带 ��ȿȭ �� �ڽ� �޼ҵ�]
}						//���� ���ε� : 
class Dog extends Animal{
	
	
	@Override
	void sound() {		//���� ���̵� : ����)��ȿȭ �ϴ�. [�θ��� �޼��带 ��ȿȭ �� �ڽ� �޼ҵ�]
		System.out.println("�۸�");
	}
}
class Cat extends Animal{
	
	@Override
	void sound() {		//���� ���̵� : ����)��ȿȭ �ϴ�. [�θ��� �޼��带 ��ȿȭ �� �ڽ� �޼ҵ�]
		System.out.println("�Ŀ�");
	}
}

class Bird extends Animal{
	@Override
	void sound() {		//���� ���̵� : ����)��ȿȭ �ϴ�. [�θ��� �޼��带 ��ȿȭ �� �ڽ� �޼ҵ�]
		System.out.println("±±");
	}
}

public class Inherit03 {

	static void start(Animal a) {
		a.sound();
	}

	public static void main(String[] args) {
		Dog d =  new Dog();
		Inherit03.start(d);
		
		Cat c = new Cat();
		Inherit03.start(c);
		
		Bird b = new Bird();
		Inherit03.start(b);
	}

}
