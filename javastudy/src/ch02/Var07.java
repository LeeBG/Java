package ch02;

class Car{		//클래스 자료형
	static int power = 2000;
	static String color = "하얀색";
	static String name = "소나타";
	static String type = "승용차";
}

public class Var07 {
	
	public static void main(String[] args) {
		Car sonata = new Car();		//new >> Heap
		
		Car.power = 5000;		//static이라 Car를 자료형으로 가지는 모든 변수들이 같이 변함
		
		sonata.color = "하얀색";
		sonata.name="소나타";
		sonata.power=2000;		//static이라 Car를 자료형으로 가지는 모든 변수들이 같이 변함
		sonata.type="승용차";
		
		
		System.out.println(Car.power);
		System.out.println(Car.name);
		System.out.println(Car.color);
		System.out.println(Car.type);

		
		System.out.println(sonata.power);
		System.out.println(sonata.name);
		System.out.println(sonata.color);
		System.out.println(sonata.type);

	}
}
