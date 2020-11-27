package client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


//v1 일방향 통신


public class SocketClient {
	private Socket socket= null;
	private PrintWriter writer = null;
	
	public SocketClient() {
		try {
			//서버쪽 accept호출	//127.0.0.1/사설 ip / localhost
			socket = new Socket("localhost",10000);
			
			//내가 메시지를 보내기 때문에 output 소켓에서 스트림 
			writer = new PrintWriter(socket.getOutputStream());
			
			// 클라이언트로 부터 입력받기
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				String line = sc.nextLine();
				writer.write(line+"\n");			//write(String+"\n");
				writer.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		new SocketClient();
	}

}
