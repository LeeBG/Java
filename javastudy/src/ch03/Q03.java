package ch03;
//P164 3������
public class Q03 {
	public static void makeStar() {
		for(int i= 0;i<5;i++) {			//����
			for(int j=i;j<5;j++) {		//�� ����(��������(i�� ��������) ���� ����)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void reverseStar() {
		for(int i= 0;i<5;i++) {			//����
			for(int j=0;j<=i;j++) {		//�� ����(��������(i�� ��������) ���� ����)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangle() {
		for(int i= 0;i<3;i++) {			//����
			for(int j=0;j<=i;j++) {		//�� ����(��������(i�� ��������) ���� ����)
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
		//����
		for (int i=0;i<num/2+1;i++) {	//���̸� �Է¹���
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
		//����
		for (int i=num/2+1;i<num;i++) {	//���̸� �Է¹���
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
