package ch09;

public enum MyLayout {		//new가 되지 않는다.
	WEST("West","서쪽"),
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");	//static final변수 꺾임
	
	private String value;
	private String value2;
	
	private MyLayout(String value) {		//생성자
		this.value=value;
	}
	private MyLayout(String value,String value2) {		//생성자
		this.value=value;
		this.value2=value2;
	}
	public String getValue2() {
		return value2;
	}
	public String getValue() {
		return value;
	}
}
