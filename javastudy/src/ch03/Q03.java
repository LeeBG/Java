package ch03;
//P164 3번문제
public class Q03 {
	public static void makeStar() {
		for(int i= 0;i<5;i++) {			//높이
			for(int j=i;j<5;j++) {		//별 갯수(높을수록(i가 작을수록) 별이 많다)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void reverseStar() {
		for(int i= 0;i<5;i++) {			//높이
			for(int j=0;j<=i;j++) {		//별 갯수(높을수록(i가 작을수록) 별이 많다)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle() {
		for(int i= 0;i<3;i++) {			//높이
			for(int j=0;j<=i;j++) {		//별 갯수(높을수록(i가 작을수록) 별이 많다)
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=3;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void little_triangle(int num) {
		//증가
		for (int i=0;i<num/2+1;i++) {	//높이를 입력받음
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
		//감소
		for (int i=num/2+1;i<num;i++) {	//높이를 입력받음
			for(int j=i/2;j>0;j-=2) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	

	}
	public static void main(String[] args) {
		makeStar();
		System.out.println("");
		triangle();
		System.out.println("");
		little_triangle(5);
	
		
	}
}
