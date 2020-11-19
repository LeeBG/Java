package composite;

public class BigBurger extends Burger{		//다형성 성립
											//다형성이 성립되지 않으면 콤포지션 사용
	public BigBurger() {
		this(2000,"빅버거");
	}
	
	public BigBurger(int price,String desc) {
		super(price,desc);		//버거의 생성자
	}
	
	
}
