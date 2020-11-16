package quiz;

import java.util.Scanner;

import javax.swing.text.View;

public class Concert {
	//공연은 하루에 한 번
	//좌석은 S석 A석, B석으로 나뉘며 10개의 좌석이 있다.
	//예약 시스템 메뉴는 '예약', '조회', '취소', '끝내기'
	//예약은 한자리만 좌석타입, 예약자명, 좌석번호 순서대로 입력받아야 예약한다.
	//	조회는 모든 좌석을 출력한다
	//	취소는 예약자의 이름을 받아 취소한다.
	//없는 이름 번호 메뉴 잘못된 취소 등 오류메시지 출력
	
	String name;
	char type;
	int number;	//좌석넘버
	int menu;
	String sit[][] = new String [3][10];
	
	public Concert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[예약]:1 [조회]:2 [취소]:3 [끝내기]:4");
		menu = Integer.parseInt(sc.nextLine());
		for(int j=0;j<3;j++) {
			for(int i=0;i<10;i++) {
				sit[j][i]="---";
			}
		}
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

	public String[][] getSit() {
		return sit;
	}

	public void setSit(String[][] sit) {
		this.sit = sit;
	}
	
	public void reservation() {
			System.out.print("\n좌석 구분 S(1) A(2) B(3) >>");
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());
			if(n>4||n<1)
				System.err.println("잘못 입력");
			else
				switch (n) {
				case 1:
					for(int i=0;i<10;i++)
						System.out.print(sit[0][i]+"");
					System.out.print("\n이름 >>");
					name=sc.nextLine();	
					System.out.print("\n번호 >>");
					sit[0][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				case 2:
					for(int i=0;i<10;i++)
						System.out.print(sit[1][i]+" ");
					System.out.println("이름 >>");
					name=sc.nextLine();	
					System.out.println("번호 >>");
					sit[1][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				case 3:
					for(int i=0;i<10;i++)
						System.out.println(sit[2][i]+"");
					System.out.println("이름 >>");
					name=sc.nextLine();	
					System.out.println("번호 >>");
					sit[2][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				default:
					break;
				}
	}
	
	public void view() {
		//조회
		for(int i=0;i<3;i++) {
			switch (i) {
			case 0:
				System.out.print("S>>");
				break;
			case 1:
				System.out.print("A>>");
				break;
			case 2:
				System.out.print("B>>");
				break;
			default:
				break;
			}
			for(int j=0;j<10;j++) {
				System.out.print(sit[i][j]);
			}
			
		}
	}
	public void cancle (){
		System.out.print("\n좌석 구분 S(1) A(2) B(3) >>");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if(n>4||n<1)
			System.err.println("잘못 입력");
		else
			switch (n) {
			case 1:
				for(int i=0;i<10;i++)
					System.out.println(sit[0][i]+"");
				System.out.println("이름 >>");
				name=sc.nextLine();	
				for(int i=0;i<10;i++) {
					if(sit[0][i].equals(name)) {
						sit[0][i]="---";
						break;
					}
				}
				break;
			case 2:
				for(int i=0;i<10;i++)
					System.out.println(sit[1][i]+"");
				System.out.println("이름 >>");
				name=sc.nextLine();	
				for(int i=0;i<10;i++) {
					if(sit[1][i].equals(name)) {
						sit[1][i]="---";
						break;
					}
				}
				break;
			case 3:
				for(int i=0;i<10;i++)
					System.out.println(sit[2][i]+"");
				System.out.println("이름 >>");
				name=sc.nextLine();	
				for(int i=0;i<10;i++) {
					if(sit[2][i].equals(name)) {
						sit[2][i]="---";
						break;
					}
				}
				break;
			default:
				break;
			}
	}
	
}
