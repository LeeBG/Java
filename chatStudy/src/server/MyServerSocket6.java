package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import protocol.Chat;

//다대다 양방향 통신

public class MyServerSocket6 {
	
	private ServerSocket serverSocket;
	Vector<SocketThread> vc;	//대기열(큐) 다른 생성자에서 써야하기 때문에 private X
	
	
	public MyServerSocket6() {
		try {
			serverSocket = new ServerSocket(10000);
			vc= new Vector<>();
			
			while(true) {		//accept해야함
				System.out.println("요청 대기중 ...");
				Socket socket =  serverSocket.accept();
				//1. 새로운 소켓 생성 socket
				//2. 새로운 스레드 생성
				//3. 새로운 스레드한테 socket변수를 넘기기 안넘기면 통신 못함 socket이 있어야 통신
				//4. 새로운 스레드 자체를 vc에 담기
				System.out.println("요청 받음 ...");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);		//클래스를 벡터에 담는다.

			}
		} catch (Exception e) {
			System.out.println("서버 연결 오류");
			e.printStackTrace();		//오류나면 오류를 추적해서 메시지로 뿌려줌
		}
	}
	class SocketThread extends Thread{		//다른 상태를 저장하기 위해
		private Socket socket;
		private String id;
		

		public void setId(String id) {
			this.id = id;
		}
		private BufferedReader reader;
		private PrintWriter writer;
		
		
		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			//소켓 스레드 자체를 넘긴다 .
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				
				String input = null;								//받은 메시지
				while((input = reader.readLine()) != null) {
					// Routing (라우팅 하기)
					// ALL 인지 MSG인지 구분해서 전달
					routing(input);						//input을 라우팅 후 전달하는 메서드 
					
//					for(int i=0;i<vc.size();i++) {		//자기자신포함 모든 스레드에 던짐
//						if(vc.get(i)!=this) {			
//							vc.get(i).writer.println(id+"-->"+input);
//							vc.get(i).writer.flush();
//						}
//					}
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private void routing(String input) {
			String gubun[] = input.split(":");
			Scanner sc = new Scanner(System.in);
			
			if(id == null) {
				if(gubun[0].equals("ID")) {
					// 변수에 ID 저장
					id = gubun[1];
					writer.println("당신의 아이디는 "+id+"입니다.");
					writer.flush();
				}else {
					writer.println("아이디를 먼저 입력하세요!");
					writer.flush();
					return;
				}
			}
			
			if(gubun[0].equals(Chat.ALL)) {
				for(int i = 0;i<vc.size();i++) {
					if(vc.get(i) != this) {
						vc.get(i).writer.println(id+"-->"+gubun[1]);
						vc.get(i).writer.flush();
					}
				}
			}else if(gubun[0].equals(Chat.MSG)) {
				String tempId = gubun[1];
				String tempMsg = gubun[2];
				
				for(int i = 0; i<vc.size();i++) {
					if(vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.println(id+"-->"+tempMsg);
						vc.get(i).writer.flush();
					}
				}
			}
			
		}//End of Routing
	}//End of SocketThread
	public static void main(String[] args) {		//서버는 중계기 역할 : 연결된 스레드에..
		
		new MyServerSocket6();
	}
}
