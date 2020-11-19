package ch04;

//디자인 패턴 : 싱글톤 패턴>> 객체를 단 한번만 만드는 패턴
//heap도 싱글톤으로 관리하면 공유할 수 있다.
class President{
	
	static President instance = new President();		//main실행전에 힙공간을 띄움
	private President() {		//이러면 생성자 호출 불가능
		
	}
	public static President getInstance() {
		return instance;
	}
}
public class SingtoneApp {

	public static void main(String[] args) {
		
		President p = President.getInstance();
		
	}

}
