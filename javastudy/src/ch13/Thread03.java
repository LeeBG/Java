package ch13;

public class Thread03{
	private static int sum;
	private  static class NewThread  implements Runnable{
		@Override
		public void run() {
			System.out.println("새로운 스레드 시작");
			for(int i=1;i<11;i++) {
				sum+=10;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		try {
			t1.join();//t1이 끝날때 까지 대기
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		System.out.println(sum);
		System.out.println("메인 스레드 종료");
	}
}
