package ch03;


// P.170 16�� ����
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// ���������� ���� �����
		String str[] = { "����", "����", "��" }; // ���� ���� ��
		String input;
		Scanner sc = new Scanner(System.in);

		int wincount = 0, drawcount = 0, losecount = 0;
		double total = 0.0;

		loop: while (true) {
			int n = (int) (Math.random() * 3); // ����� ���� ����������
			System.out.print("[����] [����] [��] [�·�] [�׸�]:");
			input = sc.nextLine();
			System.out.println("---------------------");
			switch (input) {
			case "����":// �����ε�
				if (str[n].equals("����")) { // ��밡 ������ �´ٸ�
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					drawcount++;

				} else if (str[n].equals("����")) {
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					losecount++;
				} else {// ��
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�̰���ϴ�.");
					wincount++;
				}
				System.out.println("---------------------");
				break;
			case "����":// �����ε�
				if (str[n].equals("����")) { // ��밡 ������ �´ٸ�
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�̰���ϴ�.");
					wincount++;
				} else if (str[n].equals("����")) {
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					drawcount++;
				} else {// ��
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					losecount++;
				}
				System.out.println("---------------------");
				break;
			case "��":// ���ε�
				if (str[n].equals("����")) { // ��밡 ������ �´ٸ�
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					losecount++;
				} else if (str[n].equals("����")) {
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�̰���ϴ�.");
					wincount++;
				} else {// ��
					System.out.println("�� ["+input+"] :��ǻ�� :[" + str[n] + "]");
					System.out.println("�����ϴ�.");
					drawcount++;
				}
				System.out.println("---------------------");
				break;

			case "�·�":
				if (wincount + losecount + drawcount > 0)
					total = (double) wincount / (wincount + losecount + drawcount) * 100;
				System.out
						.println("��:" + wincount + " ��:" + losecount + " ���º�:" + drawcount + "\n [�·�:" + total + "%]");
				break;

			case "�׸�":
				System.out.println("������ �����մϴ�.");
				sc.close();
				break loop;

			default:
				System.err.println("�߸��Է�");
				System.out.println("---------------------");
				break;
			}
		}

	}

}
