package ch13;

//������ ���¹�
/**
 * 
 * 1. Ŭ���� �����
 * 2. 
 *
 */
class Another implements Runnable{

	
	//���� ���� �ڵ� ��� = ����(������)
	@Override
	public void run() {
		System.out.println("���ο� ������ �����");
		for(int i =1; i<11;i++) {
			try {
				System.out.println("run :"+i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("run ������ ����");
	}
	
}
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("main ������ �����");
		
		//���ο� ������ ���� 1.������ ��ü ���� 2.Ÿ�� ����
		Thread t1 = new Thread(new Another());
		t1.start();		//�������� �����尡 ����Ǿ� ���γ��.
		
		for(int i =1; i<11;i++) {
			try {
				System.out.println("main :"+i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("main ������ ����");
	}//end of main
}//end of class
