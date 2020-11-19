package composite;

import lombok.Data;

// �������� 
@Data
public class ShrimpBurgerSet {
	private Burger burger;		//��ü ������ �ʵ忡 ����
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
