package ch03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("1~100까지 3의 배수의 합구하기");
		for(int i=0;i<101;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("합"+sum);
	}

}
