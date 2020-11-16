package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	
	//초기화를 위한 생성자	
	public Person(String n,String j,int a, char g,String b) {	//지역변수 5개 호출시 열림 (stack)
		name = n ;
		job = j;
		age = a;
		gender = g;
		blood = b;
	}
	public Person() {
		// 디폴트 생성자는 생성자가 하나도 없으면 컴파일러가 자동으로 만들어 줌
		// 만약에 생성자가 있으면 디폴트 생성자를 만들어 주지 않으므로 일일이 만들어 줘야함(오버로딩이용)
	}
	
	public void preview() {
		System.out.println("====="+name+"=====");
		System.out.println("직업 : "+ job);
		System.out.println("나이 : "+ age);
		System.out.println("성별 : "+ gender);
		System.out.println("혈액형 : "+ blood);
		System.out.println();
	}
}
