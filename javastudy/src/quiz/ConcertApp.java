package quiz;

import java.util.Scanner;

public class ConcertApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		Concert c = new Concert();
		// Integer.parseInt(sc.nextLine())
		loop: while (true) {
			// �޴�
			System.out.println("[����]:1 [��ȸ]:2 [���]:3 [������]:4");
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
		System.out.println(" --- 3�� �� ���� --- ");
		Thread.sleep(3000);
		System.exit(0);
	}

}
