package ch02;

public class Var04 {
	public static void main(String[] args) {
		// ���� �������� �����ϰ� �ʹ� 1,2,3
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		// ���� ������ 1,2,3

		int[] n = { 1, 2, 3 };

		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
		}System.out.println("");
		
		System.out.println(n);
		
		
		//���� ������ ��,��,��
		
		char [] ch = {'��','��','��'};
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}System.out.println();
		
	}// end of main
}
