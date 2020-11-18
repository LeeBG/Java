package ch03;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("금액을 입력하세요:");
		int price = Integer.parseInt(sc.nextLine());	//입력받는 금액
		int sub;										//빼는 동전갯수 sub
		
		for(int i=0;i<unit.length;i++) {
			sub = price/unit[i];
			System.out.println(unit[i]+"원 짜리 :"+price/unit[i]+"개");
			price = price-sub*unit[i];	//내고 남은돈
			if(i==2 || i==4) {
				i++;
			}
		}

	}
}
