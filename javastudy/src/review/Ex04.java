package review;

import lombok.Data;		//lombok

@Data		//toString이 오버라이드 됨 필드에 대한 getter,setter가 만들어짐
class Product{
	private int no;				//상품 번호
	private int price;			//상품 가격
	private String name;		//상품 이름
}
public class Ex04 {

	public static void main(String[] args) {
		//클래스 자료형 (여러가지 데이터 타입이 섞여 있을 때) 
		Product p1 = new Product();
		System.out.println(p1);		//클래스 이름과 Hash코드가뜸
	}
}
