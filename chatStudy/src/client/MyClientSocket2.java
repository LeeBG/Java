package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;		//메인 스레드가 쓰고 있으니까
	
	public MyClientSocket2() {
		try {
			socket = new Socket("127.0.0.1",10000);
			Scanner sc = new Scanner(System. in);
			//키보드로 입력받아서
			//소켓에 버퍼 달기
			BufferedWriter writer= 
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("서버로 부터 온 메시지: " +input);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
			
			//메인 스레드는 키보드로 부터 입력을 받은뒤 클라인언트 소켓에 전송
			while(true) {
				String input = sc.nextLine();
				writer.write(input+"\n");
				writer.flush();		//스트림에 전송
			}
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyClientSocket2();
	}
}
