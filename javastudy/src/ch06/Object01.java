package ch06;

class User{
	
}
class Person{
	
}


// 1. Object�� ���������ϴ�.
public class Object01 extends Object{
	
	public static void main(String[] args) {
		
		Object[] users = new Object[2];
		users[0] = new User();
		users[1] = new Person();
		
		Object num = 1;					//Object�� ��� Ÿ���� �� ���� �� �ִ�.
		Object str = "���ڿ�";			//��� Ÿ���� �� ����Ѵ�.
		Object ch = '��';
		Object dou = 10.5;
	}
}
