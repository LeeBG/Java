package ch03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"1","1","1","1","1","1","1","1","1","1"};

		for (int i = 0; i < name.length; i++) {
			name[i]=""+i;
			System.out.print(name[i]+" ");
		}
		System.out.println("");
		
		
		//�ݺ��� -> ������ �ݺ��Ǵ� ��
		//�ʱⰪ i=1 (for���� ���۵Ǳ��� �ѹ��� ȣ���)
		//���ǽ��� i�� 5���� ���� ������ �ݺ��ϰ�
		//������ �� �� ����� ������ i�� 1�� ����
		
//		ù ��° ������ �ʱⰪ ���� �� ���� Ȯ��
//		�ι�° ���� ���ʹ�  i�� ���� �� ���� Ȯ��(�ݺ�)
		for (int i=1;i<5;i++) {
			System.out.println("����: "+i);
		}
		
		System.out.println("--------------");
		for (int i = 4; i >= 1 ; i--) {
			System.out.println("����: "+i);
		}
		
		System.out.println("--------------");
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.println("����: "+i);
		}
		System.out.println("--------------");
		
		int count =0;
												//0���� 100������ �� �߿��� 3�� ����� ����Ͻÿ�.
		for (int i = 0; i <= 100; i++) {		//0���� 100���� 3�� ��� ���
			if(i%3==0 && i>0) {
				count+=1;
				System.out.println("3 x "+count+" = "+i);
			}		
		}
		System.out.println("--------------");
	}
		
	

}
