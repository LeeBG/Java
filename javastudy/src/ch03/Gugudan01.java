package ch03;

public class Gugudan01 {

	public static void main(String[] args) {
		//구구단 2단을 출력하는 프로그램을 만들어 주세요
		System.out.println("\t\t======구구단======");
		for(int i =1 ;i<10;i++) {
			for(int j=2;j<6;j++) {
				System.out.print(j+" x "+i+" = "+i*j+" \t");
			}
			System.out.println();
		}
		System.out.println("============================================================");
		for(int i =1 ;i<10;i++) {
			for(int j=6;j<10;j++) {
				System.out.print(j+" x "+i+" = "+i*j+" \t");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		System.out.println("2x1=2");
		System.out.println("2x2=4");
		System.out.println("2x3=6");
		System.out.println("2x4=8");
		System.out.println("2x5=10");
		System.out.println("2x6=12");
		System.out.println("2x7=14");
		System.out.println("2x8=16");
		System.out.println("2x9=18");
		
		System.out.println("--------------");
		System.out.println("3x1=3");
		System.out.println("3x2=6");
		System.out.println("3x3=9");
		System.out.println("3x4=12");
		System.out.println("3x5=15");
		System.out.println("3x6=18");
		System.out.println("3x7=21");
		System.out.println("3x8=24");
		System.out.println("3x9=27");
	}
	
}
