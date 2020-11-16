package quiz;

import java.util.Scanner;

import javax.swing.text.View;

public class Concert {
	//������ �Ϸ翡 �� ��
	//�¼��� S�� A��, B������ ������ 10���� �¼��� �ִ�.
	//���� �ý��� �޴��� '����', '��ȸ', '���', '������'
	//������ ���ڸ��� �¼�Ÿ��, �����ڸ�, �¼���ȣ ������� �Է¹޾ƾ� �����Ѵ�.
	//	��ȸ�� ��� �¼��� ����Ѵ�
	//	��Ҵ� �������� �̸��� �޾� ����Ѵ�.
	//���� �̸� ��ȣ �޴� �߸��� ��� �� �����޽��� ���
	
	String name;
	char type;
	int number;	//�¼��ѹ�
	int menu;
	String sit[][] = new String [3][10];
	
	public Concert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[����]:1 [��ȸ]:2 [���]:3 [������]:4");
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
			System.out.print("\n�¼� ���� S(1) A(2) B(3) >>");
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());
			if(n>4||n<1)
				System.err.println("�߸� �Է�");
			else
				switch (n) {
				case 1:
					for(int i=0;i<10;i++)
						System.out.print(sit[0][i]+"");
					System.out.print("\n�̸� >>");
					name=sc.nextLine();	
					System.out.print("\n��ȣ >>");
					sit[0][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				case 2:
					for(int i=0;i<10;i++)
						System.out.print(sit[1][i]+" ");
					System.out.println("�̸� >>");
					name=sc.nextLine();	
					System.out.println("��ȣ >>");
					sit[1][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				case 3:
					for(int i=0;i<10;i++)
						System.out.println(sit[2][i]+"");
					System.out.println("�̸� >>");
					name=sc.nextLine();	
					System.out.println("��ȣ >>");
					sit[2][Integer.parseInt(sc.nextLine())-1]=name;
					break;
				default:
					break;
				}
	}
	
	public void view() {
		//��ȸ
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
		System.out.print("\n�¼� ���� S(1) A(2) B(3) >>");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if(n>4||n<1)
			System.err.println("�߸� �Է�");
		else
			switch (n) {
			case 1:
				for(int i=0;i<10;i++)
					System.out.println(sit[0][i]+"");
				System.out.println("�̸� >>");
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
				System.out.println("�̸� >>");
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
				System.out.println("�̸� >>");
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
