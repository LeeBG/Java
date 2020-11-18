package quiz;

import java.util.Scanner;

public class Concert {
	/*
	 * p247 12번 문제 main 공연은 하루에 한 번 좌석은 S석 A석, B석으로 나뉘며 10개의 좌석이 있다. 예약 시스템 메뉴는
	 * '예약', '조회', '취소', '끝내기' 예약은 한자리만 좌석타입, 예약자명, 좌석번호 순서대로 입력받아야 예약한다.
	 *  조회는 모든 좌석을출력한다.
	 *  취소는 예약자의 이름을 받아 취소한다. 없는 이름 번호 메뉴 잘못된 취소 등 오류메시지 출력
	 * 
	 */
	String name;
	char type;
	int number; // 좌석넘버
	int menu;
	int seatmenu;
	String seat[][] = new String[3][10];

	public Concert() { // 좌석 초기화 기본 생성자
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 10; i++) {
				seat[j][i] = "---";
			}
		}
		start();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public String[][] getSeat() {
		return seat;
	}

	public void setSeat(String[][] seat) {
		this.seat = seat;
	}

	public void reservation() {
		System.out.print("\n좌석 구분 S(1) A(2) B(3) >>");
		Scanner sc = new Scanner(System.in);
		seatmenu = Integer.parseInt(sc.nextLine());
		if (seatmenu > 4 || seatmenu < 1)
			System.err.println("잘못 입력");
		else
			switch (seatmenu) {
			case 1:
				System.out.print("S>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[0][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc.nextLine();
				System.out.print("\n번호 >>");
				seat[0][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			case 2:
				System.out.print("A>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[1][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc.nextLine();
				System.out.print("\n번호 >>");
				seat[1][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			case 3:
				System.out.print("B>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[2][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc.nextLine();
				System.out.print("\n번호 >>");
				seat[2][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			default:
				break;
			}
	}

	public void view() {
		// 조회
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				System.out.print("S>> ");
				break;
			case 1:
				System.out.print("A>> ");
				break;
			case 2:
				System.out.print("B>> ");
				break;
			default:
				break;
			}
			for (int j = 0; j < 10; j++) {
				System.out.print(seat[i][j] + " \t");
			}
			System.out.println("");
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	public void cancle() {
		System.out.print("\n좌석 구분 S(1) A(2) B(3) >>");
		Scanner sc2 = new Scanner(System.in);
		seatmenu = Integer.parseInt(sc2.nextLine());
		if (seatmenu > 4 || seatmenu < 1)
			System.err.println("잘못 입력");
		else
			switch (seatmenu) {
			case 1:
				System.out.print("S>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[0][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc2.nextLine();
				for (int i = 0; i < 10; i++) {
					if (seat[0][i].equals(name)) {
						seat[0][i] = "---";
						break;
					}
				}
				break;
			case 2:
				System.out.print("A>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[1][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc2.nextLine();
				for (int i = 0; i < 10; i++) {
					if (seat[1][i].equals(name)) {
						seat[1][i] = "---";
						break;
					}
				}
				break;
			case 3:
				System.out.print("B>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[2][i] + " \t");
				System.out.print("\n이름 >>");
				name = sc2.nextLine();
				for (int i = 0; i < 10; i++) {
					if (seat[2][i].equals(name)) {
						seat[2][i] = "---";
						break;
					}
				}
				break;
			default:
				break;
			}
	}

	public void start() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		loop: while (true) {
			// 메뉴
			System.out.println("[예약]:1 [조회]:2 [취소]:3 [끝내기]:4");
			setMenu(Integer.parseInt(sc3.nextLine()));
			switch (getMenu()) {
			case 1:
				reservation();
				break;
			case 2:
				view();
				break;
			case 3:
				cancle();
				break;
			default:
				break loop;
			}
		}
		System.out.println(" --- 3초 후 종료 --- ");
		System.exit(0);
	}
}
