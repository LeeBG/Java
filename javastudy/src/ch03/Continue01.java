package ch03;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//sc�� ��������
		System.out.println("���� 5�� �Է��ϼ���.");

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();

			if (n <= 0) { // �����̰ų� 0�̸�
//				continue; // ��� ���� �ݺ������� �Ѿ�� ��ɾ�
				break;
			} else {
				sum += n;
			}
			
			//���⼭ ����� ��� ������ �����ϰ� �ݺ������� �Ѿ
			System.out.println("!");
			System.out.println("!");
			System.out.println("!");
			
			System.out.println("����� ��: "+sum);
			sc.close();//���ϰ� ������������ �ݾƼ� �޸� Ȯ�� stack
		}
	}
}
