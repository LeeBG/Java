package coffee;

public class CoffeeApp {
	
	public static void main(String[] args) {
		Barista b1 = new Barista();
		Customer c1 = new Customer();		//가게의 기본요소
		
		// 고객 => 바리스타와 협력
		c1.order(b1);
		c1.eat(b1.makeCoffee());			//만들어진 커피를 eat
		
	}

}
