package quiz;

import java.util.Scanner;

public class Concert {
	/*
	 * p247 12�� ���� main ������ �Ϸ翡 �� �� �¼��� S�� A��, B������ ������ 10���� �¼��� �ִ�. ���� �ý��� �޴���
	 * '����', '��ȸ', '���', '������' ������ ���ڸ��� �¼�Ÿ��, �����ڸ�, �¼���ȣ ������� �Է¹޾ƾ� �����Ѵ�.
	 *  ��ȸ�� ��� �¼�������Ѵ�.
	 *  ��Ҵ� �������� �̸��� �޾� ����Ѵ�. ���� �̸� ��ȣ �޴� �߸��� ��� �� �����޽��� ���
	 * 
	 */
	String name;
	char type;
	int number; // �¼��ѹ�
	int menu;
	int seatmenu;
	String seat[][] = new String[3][10];

	public Concert() { // �¼� �ʱ�ȭ �⺻ ������
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
		System.out.print("\n�¼� ���� S(1) A(2) B(3) >>");
		Scanner sc = new Scanner(System.in);
		seatmenu = Integer.parseInt(sc.nextLine());
		if (seatmenu > 4 || seatmenu < 1)
			System.err.println("�߸� �Է�");
		else
			switch (seatmenu) {
			case 1:
				System.out.print("S>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[0][i] + " \t");
				System.out.print("\n�̸� >>");
				name = sc.nextLine();
				System.out.print("\n��ȣ >>");
				seat[0][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			case 2:
				System.out.print("A>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[1][i] + " \t");
				System.out.print("\n�̸� >>");
				name = sc.nextLine();
				System.out.print("\n��ȣ >>");
				seat[1][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			case 3:
				System.out.print("B>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[2][i] + " \t");
				System.out.print("\n�̸� >>");
				name = sc.nextLine();
				System.out.print("\n��ȣ >>");
				seat[2][Integer.parseInt(sc.nextLine()) - 1] = name;
				break;
			default:
				break;
			}
	}

	public void view() {
		// ��ȸ
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
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}

	public void cancle() {
		System.out.print("\n�¼� ���� S(1) A(2) B(3) >>");
		Scanner sc2 = new Scanner(System.in);
		seatmenu = Integer.parseInt(sc2.nextLine());
		if (seatmenu > 4 || seatmenu < 1)
			System.err.println("�߸� �Է�");
		else
			switch (seatmenu) {
			case 1:
				System.out.print("S>> ");
				for (int i = 0; i < 10; i++)
					System.out.print(seat[0][i] + " \t");
				System.out.print("\n�̸� >>");
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
				System.out.print("\n�̸� >>");
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
				System.out.print("\n�̸� >>");
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
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		loop: while (true) {
			// �޴�
			System.out.println("[����]:1 [��ȸ]:2 [���]:3 [������]:4");
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
		System.out.println(" --- 3�� �� ���� --- ");
		System.exit(0);
	}
}
