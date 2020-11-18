package ch03;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		
		for(char a = c; a>='a'; a--) {
//			System.out.print(a);
			for(char s = 'a'; s <= a;s++) {
				System.out.print(s);
			}
			System.out.println();
		}



		
//		for(char r ='h' ;r == 'a';r--) {
//			for(char ch  = 'a' ; ch > c; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
	}

}
