package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("���ο� ������");
	}
}
public class Thread02 {
	public static void main(String[] args) {
		//������ ��ü ����
		//Ÿ�� ����
		//�����ϱ�
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		NewThread t2 = new NewThread();		//������ ��ü
		t2.start();
	}
}
