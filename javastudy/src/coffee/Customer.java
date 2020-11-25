package coffee;

// 고객
// 책임 : 메뉴 주문() , 먹기
public class Customer {

	public void order(Barista b1) {
		//주문
		//바리스타에게 메시지를 보낸다.	(함수를 호출한다.)
		Coffee c = b1.makeCoffee();	//책임을 때린다.
		System.out.println(c.getName()+"이 나왔습니다.");
	}
	public void eat(Coffee c) {
		System.out.println(c.getName()+"을 먹었습니다.");
	}
}
