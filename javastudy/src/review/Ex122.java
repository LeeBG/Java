package review;

class 저장소{
	String data;
	
	String 다운로드() {
		data = "GTA5 게임";				//동기적 프로그램
		try {
			Thread.sleep(3000);			//exception이 발생할 수 있다. 운영체제에 중요한 작업으로
										//인터럽트 발생 할 수 있다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("괜찮지 않아...");
		}	//1000 = 1초
		return data;
	}
}
public class Ex122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		저장소 s =  new 저장소();
		String game = s.다운로드();
	
		System.out.println(game+"실행");
	}
	
	//인터페이스의 특징 : 타입일치, 강제성, 자바에서는 메서드를 함수의 인수로 전달할 수 없다.
	//자바는 메서드를 함수의 매개변수로 전달하고 싶으면 무조건 인터페이스에 함수를 담는다.
	//익명클래스로 넘긴다.

}
