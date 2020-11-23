package review;

interface Helloable{
	void 안녕();
}

public class Ex123 {
	static void start(Helloable h) {		//공통모듈로 만들기 위해
		h.안녕();
	}
	
	public static void main(String[] args) {
		start(new Helloable() {
			@Override
			public void 안녕() {
				System.out.println("반갑습니다.");
				
			}
		});
	}

}
