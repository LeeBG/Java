package ch03;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//sc는 지역변수
		System.out.println("정수 5개 입력하세요.");

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();

			if (n <= 0) { // 음수이거나 0이면
//				continue; // 즉시 다음 반복문으로 넘어가는 명령어
				break;
			} else {
				sum += n;
			}
			
			//여기서 양수면 출력 음수면 무시하고 반복문으로 넘어감
			System.out.println("!");
			System.out.println("!");
			System.out.println("!");
			
			System.out.println("양수의 합: "+sum);
			sc.close();//부하가 많아지기전에 닫아서 메모리 확보 stack
		}
	}
}
