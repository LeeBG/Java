package ch03;

public class For02 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%2==0 && i>0) {		//2�γ��� �������� 0 �̸鼭 0���ٴ� ū �ڿ���
									//�񱳿����� + �������� && ���
				System.out.println("¦�� : "+i);
			}
		}

		for (int i = 0; i < 100; i++) {
			if(i%2==1 && i>0) {		//2�γ��� �������� 1 �̸鼭 0���ٴ� ū �ڿ���
									//�񱳿����� + �������� && ���
				System.out.println("Ȧ�� : "+i);
			}
		}
	}
}
