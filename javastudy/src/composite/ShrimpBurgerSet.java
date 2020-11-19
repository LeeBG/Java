package composite;

import lombok.Data;

// 콤포지션 
@Data
public class ShrimpBurgerSet {
	private Burger burger;		//객체 변수를 필드에 적고
	private Potato potato;
	private Coke coke;

	public ShrimpBurgerSet(ShrimpBurger burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}

	public ShrimpBurgerSet() {
		this(new ShrimpBurger(), new Potato(), new Coke());
	}

}
