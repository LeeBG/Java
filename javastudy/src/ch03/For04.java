package ch03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("1~100���� 3�� ����� �ձ��ϱ�");
		for(int i=0;i<101;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("��"+sum);
	}

}
