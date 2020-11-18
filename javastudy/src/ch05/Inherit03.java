package ch05;

class Animal{
	void sound() {}		//오버 라이딩 : 직역)무효화 하다. [부모의 메서드를 무효화 후 자식 메소드]
}						//동적 바인딩 : 
class Dog extends Animal{
	
	
	@Override
	void sound() {		//오버 라이딩 : 직역)무효화 하다. [부모의 메서드를 무효화 후 자식 메소드]
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	
	@Override
	void sound() {		//오버 라이딩 : 직역)무효화 하다. [부모의 메서드를 무효화 후 자식 메소드]
		System.out.println("냐옹");
	}
}

class Bird extends Animal{
	@Override
	void sound() {		//오버 라이딩 : 직역)무효화 하다. [부모의 메서드를 무효화 후 자식 메소드]
		System.out.println("짹짹");
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
