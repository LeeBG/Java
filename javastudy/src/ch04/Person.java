package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	
	//�ʱ�ȭ�� ���� ������	
	public Person(String n,String j,int a, char g,String b) {	//�������� 5�� ȣ��� ���� (stack)
		name = n ;
		job = j;
		age = a;
		gender = g;
		blood = b;
	}
	public Person() {
		// ����Ʈ �����ڴ� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� ����� ��
		// ���࿡ �����ڰ� ������ ����Ʈ �����ڸ� ����� ���� �����Ƿ� ������ ����� �����(�����ε��̿�)
	}
	
	public void preview() {
		System.out.println("====="+name+"=====");
		System.out.println("���� : "+ job);
		System.out.println("���� : "+ age);
		System.out.println("���� : "+ gender);
		System.out.println("������ : "+ blood);
		System.out.println();
	}
}
