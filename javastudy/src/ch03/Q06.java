package ch03;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("�ݾ��� �Է��ϼ���:");
		int price = Integer.parseInt(sc.nextLine());	//�Է¹޴� �ݾ�
		int sub;										//���� �������� sub
		
		for(int i=0;i<unit.length;i++) {
			sub = price/unit[i];
			System.out.println(unit[i]+"�� ¥�� :"+price/unit[i]+"��");
			price = price-sub*unit[i];	//���� ������
			if(i==2 || i==4) {
				i++;
			}
		}

	}
}
