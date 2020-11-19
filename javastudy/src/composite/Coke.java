package composite;

import lombok.Data;

@Data
public class Coke {
	private int price;
	private String desc;	//설명
	
	public Coke(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"가 만들어졌습니다.");
	}
	public Coke() {
		this(1000,"코카콜라");
	}
	
}
