package quiz;

import java.util.Scanner;

public class ConcertApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		
		Concert c = new Concert();
		// Integer.parseInt(sc.nextLine())
		loop: while (true) {
			// 메뉴
			System.out.println("[예약]:1 [조회]:2 [취소]:3 [끝내기]:4");
			c.setMenu(Integer.parseInt(sc.nextLine()));
			switch (c.getMenu()) {
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
		System.out.println(" --- 3초 후 종료 --- ");
		Thread.sleep(3000);
		System.exit(0);
	}

}
