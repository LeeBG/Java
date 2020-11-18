package ch03;


// P.170 16번 문제
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// 가위바위보 게임 만들기
		String str[] = { "가위", "바위", "보" }; // 가위 바위 보
		String input;
		Scanner sc = new Scanner(System.in);

		int wincount = 0, drawcount = 0, losecount = 0;
		double total = 0.0;

		loop: while (true) {
			int n = (int) (Math.random() * 3); // 상대의 랜덤 가위바위보
			System.out.print("[가위] [바위] [보] [승률] [그만]:");
			input = sc.nextLine();
			System.out.println("---------------------");
			switch (input) {
			case "가위":// 가위인데
				if (str[n].equals("가위")) { // 상대가 가위를 냈다면
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("비겼습니다.");
					drawcount++;

				} else if (str[n].equals("바위")) {
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("졌습니다.");
					losecount++;
				} else {// 보
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("이겼습니다.");
					wincount++;
				}
				System.out.println("---------------------");
				break;
			case "바위":// 바위인데
				if (str[n].equals("가위")) { // 상대가 가위를 냈다면
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("이겼습니다.");
					wincount++;
				} else if (str[n].equals("바위")) {
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("비겼습니다.");
					drawcount++;
				} else {// 보
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("졌습니다.");
					losecount++;
				}
				System.out.println("---------------------");
				break;
			case "보":// 보인데
				if (str[n].equals("가위")) { // 상대가 가위를 냈다면
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("졌습니다.");
					losecount++;
				} else if (str[n].equals("바위")) {
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("이겼습니다.");
					wincount++;
				} else {// 보
					System.out.println("나 ["+input+"] :컴퓨터 :[" + str[n] + "]");
					System.out.println("비겼습니다.");
					drawcount++;
				}
				System.out.println("---------------------");
				break;

			case "승률":
				if (wincount + losecount + drawcount > 0)
					total = (double) wincount / (wincount + losecount + drawcount) * 100;
				System.out
						.println("승:" + wincount + " 패:" + losecount + " 무승부:" + drawcount + "\n [승률:" + total + "%]");
				break;

			case "그만":
				System.out.println("게임을 종료합니다.");
				sc.close();
				break loop;

			default:
				System.err.println("잘못입력");
				System.out.println("---------------------");
				break;
			}
		}

	}

}
