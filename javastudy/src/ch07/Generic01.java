package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{	//응답받을 데이터 trans object
	private int statusCode;	//200[성공] 정상적, 300[다시요청] 기다려라 , 400[잘못된 요청] 잘못됨.
//	private Object data;
	//Object타입은 다 쓸 수 있지만 사용하기 어렵다
	private T data;		//T는 아직 정해지지 않은 타입ㅁ
}
class Dog{
	String name = "안녕";
}
// 데이터 타입이 가변적 / 데이터 타입을 모르는 상황 >> generic <>
public class Generic01 {

	public static void main(String[] args) {
		ResponseDto <Integer> dto= new ResponseDto();		//<안에 wrapper 클래스>
		dto.setStatusCode(200);	//200받았다 가정
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}
