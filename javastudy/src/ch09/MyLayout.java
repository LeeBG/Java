package ch09;

public enum MyLayout {		//new�� ���� �ʴ´�.
	WEST("West","����"),
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");	//static final���� ����
	
	private String value;
	private String value2;
	
	private MyLayout(String value) {		//������
		this.value=value;
	}
	private MyLayout(String value,String value2) {		//������
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
