package ch03;

public class If01 {

	public static void main(String[] args) {
		
		//ǥ���� : �� ���ο� �ɸ��� ���ν����� �ٷ� �����. �׻� ���ǽ��� ���̵ž� ������ �ȴ�.
		if(true) {
			System.out.println("true�Դϴ�.");
		}
		
		//������ ���� ǥ�ô� �����Ͽ����� �߰� ����� �ڵ�� �� �� ���ٴ� �ڵ�
//		if(false) {		//���ʿ� ������ �ȵǴ� �����ڵ� �ֳ��ϸ� ���ǽ��� ���� �� ������ �Ǳ� ����
//			
//		}
		int num =0;
		if(num > 1) {		//�񱳿����� ��� > 1���� Ŭ ��
			System.out.println("num�� 1���� Ů�ϴ�");
		}else {
			System.out.println("num�� 1���� �۽��ϴ�.");
		}
		
		int sum = 20;
		if (sum ==10) {
			System.out.println("sum�� 10�Դϴ�.");
		}else if (sum ==20) {
			System.out.println("sum�� 20�Դϴ�.");
		}else{
			System.out.println("sum�� 30�Դϴ�.");
		}
	}

}
