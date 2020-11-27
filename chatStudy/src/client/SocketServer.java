package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	private ServerSocket serversocket = null;	//스트림 연결 소켓
	private Socket socket = null;				//채팅을 실질적으로 하는 소켓
	private BufferedReader reader =null;		// 받는 버퍼
	
	public SocketServer() {
	
		try {
			serversocket = new ServerSocket(10000);	//포트설정
			
			//클라이언트로 부터 접속 대기
			System.out.println("클라이언트로 부터 접속 대기중.");
			socket = serversocket.accept();	//접속할때까지 블락
			System.out.println("요청이 성공함");
			
			//system.in (키보드 요청), con.getInputstream(),
			//socket.getInputstream()
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = null;
			
			//메인 스레드 역할
			while((line = reader.readLine())!=null) {
				System.out.println("클라이언트 : "+line);
			}
			
			reader.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SocketServer();
	}
}
