package ch09;

//변수 : public static final이 생략되어있음
// 실수방지 런타임에서의 오류방지
public interface Batch {
	String EAST="East";			//final변수는 대문자로 만드는것을 규칙으로함
	String WEST="West";			//final변수는 대문자로 만드는것을 규칙으로함
	String CENTER="Center";		//final변수는 대문자로 만드는것을 규칙으로함
	String SOUTH="South";		//final변수는 대문자로 만드는것을 규칙으로함
	String NORTH="North";		//final변수는 대문자로 만드는것을 규칙으로함
}
