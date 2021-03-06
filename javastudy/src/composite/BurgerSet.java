package composite;

import lombok.Data;

// 콤포지션 
@Data
public class BurgerSet {
	private Burger burger;		//객체 변수를 필드에 적고
	private Potato potato;
	private Coke coke;

	public BurgerSet(Burger burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}

	public BurgerSet() {
		this(new Burger(), new Potato(), new Coke());
	}

}
