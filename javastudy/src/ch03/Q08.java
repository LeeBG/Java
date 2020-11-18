package ch03;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_num = 0;
		System.out.print("몇개의 정수를 입력받겠습니까? :");
		no_num=Integer.parseInt(sc.nextLine());
		int arr[] = new int[99];
		
		if(no_num<100) {
			for(int i=0;i<no_num;i++) {
				arr[i] =(int)(Math.random()*100);
				System.out.print(arr[i]+" ");
				if((i+1)%10==0) {
					System.out.println();//줄바꿈
				}
			}
		}else {
			System.err.println("잘못된입력");
		}
	
	}

}
