package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}
public class Thread02 {
	public static void main(String[] args) {
		//스레드 객체 생성
		//타겟 설정
		//실행하기
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		NewThread t2 = new NewThread();		//스레드 객체
		t2.start();
	}
}
