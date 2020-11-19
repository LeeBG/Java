package composite;

import lombok.Data;

@Data
public class Potato {
	private int price;
	private String desc;	//설명
	
	public Potato(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"가 만들어졌습니다.");
	}
	public Potato() {
		this(1000,"감자튀김");
	}
	
}
