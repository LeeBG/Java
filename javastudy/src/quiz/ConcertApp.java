package quiz;

public class ConcertApp {

	public static void main(String[] args) {
		
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		loop:while(true){
			//�޴�
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
		System.out.println("---����---");
	}

}
