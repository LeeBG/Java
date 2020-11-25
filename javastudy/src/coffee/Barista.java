package coffee;


//바리스타 커피제조의 책임이 있다.
//책임 : 커피제조

public class Barista {
	
	public Coffee makeCoffee() {
		
		return new Coffee();	//새로운 커피를 생성하여 반환
	}
}
