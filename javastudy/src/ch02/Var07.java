package ch02;

class Car{		//Ŭ���� �ڷ���
	static int power = 2000;
	static String color = "�Ͼ��";
	static String name = "�ҳ�Ÿ";
	static String type = "�¿���";
}
class Sonata extends Car{
	
}
public class Var07 {
	
	public static void main(String[] args) {
		Car sonata = new Car();
		Car.power = 5000;
		
		sonata.color = "�Ͼ��";
		sonata.name="�ҳ�Ÿ";
		sonata.power=2000;
		sonata.type="�¿���";
		
		
		
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
