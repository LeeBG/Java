package ch06;

class User{
	
}
class Person{
	
}


// 1. Object는 생략가능하다.
public class Object01 extends Object{
	
	public static void main(String[] args) {
		
		Object[] users = new Object[2];
		users[0] = new User();
		users[1] = new Person();
		
		Object num = 1;					//Object는 모든 타입을 다 받을 수 있다.
		Object str = "문자열";			//모든 타입을 다 상속한다.
		Object ch = '가';
		Object dou = 10.5;
	}
}
