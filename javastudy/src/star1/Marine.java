package star1;

/**
 * @author dita_808
 *
 */
class Marine{
	
	//멤버변수:필드:heap변수:전역변수:속성:프로퍼티
	//field , property 는 private 마법 X(행위를 통해서 상태를 변화 시키기 위해)
	
	private String name;		//사적인 범위 클래스
	private int hp;
	private int attack;
	
	//Alt + Shift + S				//source 단축키
	//this 는 heap을 가리킨다.
	
	public Marine(String name, int hp, int attack) {
		this.name = name;			//this.필드 => 지역변수 this를 빼면 지역변수로 알아먹음
		this.hp = hp;				//변수는 가까이 있는 것을 찾기 때문에 this(힙 변수)
		this.attack = attack;
	}
	
	public Marine() {
		// TODO Auto-generated constructor stub
	}
	
	   
}
