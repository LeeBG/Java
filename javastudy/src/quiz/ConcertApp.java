package quiz;

public class ConcertApp {

	public static void main(String[] args) {
		
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		loop:while(true){
			//메뉴
			Concert c = new Concert();
			switch (c.menu) {
			case 1:
				c.reservation();
				break;
			case 2:
				c.view();
				break;
			case 3:
				c.cancle();
				break;
			default:
				break loop;
			}
		}
		System.out.println("---종료---");
	}

}
