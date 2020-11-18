package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("인트");
		int num = sc.nextInt();		//블락킹:입력받을 때까지 기다림
		System.out.println(num);
		System.out.println("스트링");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("스트링 입력 됐는지 확인");
	}

}
