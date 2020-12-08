package chat;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {

	private ServerSocket serverSocket;
	private static final  String TAG = "ChatServer : ";
	private Vector<ClientInfo> vc;						//연결된 클라이언트 (소켓)을 담는 컬렉션
	private String id;									//스레드에서 받는 아이디 값
	public ChatServer() {
		try {

			vc = new Vector<>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG+"클라이언트 연결 대기중");
			
			//↓↓↓↓ 메인스레드의 역할 ↓↓↓↓
			while(true) {
				Socket socket = serverSocket.accept();		//클라이언트 연결대기
				System.out.println(TAG+"클라이언트 연결 완료");
				ClientInfo clientInfo = new ClientInfo(socket,id);
				clientInfo.start();
				vc.add(clientInfo);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//벡터에 담기 위한 내부 클래스 
	class ClientInfo extends Thread{
		Socket socket;					//콤포지션해서 소켓을 가지고 있어야 함.
		BufferedReader reader;
		PrintWriter writer;				// BufferedWriter와 다른 점은 내려쓰기 함수를 지원해줌
		String id;
		
		public ClientInfo(Socket socket,String id) {
			this.socket= socket;
			this.id = id;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
			} catch (Exception e) {
				System.err.println("서버 연결 실패: "+e.getMessage());
			}
		}
		
		/*
		 * 새로운 스레드의 역할 : 클라이언트로 부터 받은 메시지를 모든 클라이언트에게
		 * 재전송한다.
		 */
		
		@Override
		public void run() {			//직접구현		
			//메시지를 읽어서 써 줌
			try {
				id=null;
				id = reader.readLine();		//아이디 받기
				String input=null;
				while((input = reader.readLine())!=null) {
					routing(input);			//프로토콜 라우팅
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private void routing(String input) {
			String gubun[] = input.split("]");
			
			if((gubun[0].substring(1)).equals(ChatProtocol.ALL)) {
				try {
					FileOutputStream output = new FileOutputStream("C:\\out.txt",true);
					output.write(("["+this.id+"]"+gubun[1]+"\n").getBytes());
				} catch (Exception e) {
					e.printStackTrace();
				}
				for(int i =0;i<vc.size();i++) {
					
					if(vc.get(i) != this) {
						vc.get(i).writer.append("["+this.id+"]"+gubun[1]+"\n");
						vc.get(i).writer.flush();
					}
				}
			}else if((gubun[0].substring(1)).equals(ChatProtocol.MSG)) {		//귓속말
				
				String tempId = gubun[1].substring(1);
				String tempMsg = gubun[2];
				
				for(int i = 0 ; i <vc.size();i++) {
					if(vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.append("["+this.id+"]"+tempMsg+"\n");
						vc.get(i).writer.flush();
					}
				}
				
			}		
		}
	}
	public static void main(String[] args) {
		new ChatServer();
	}

}
