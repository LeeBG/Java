package chatV4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class SocketServer {
	ServerSocket serverSocket;
	Vector<SocketThread> vc;
	
	public SocketServer() {
		//서버 소켓 생성 65536번 중에서 0 ~ 1023(well known port)를
		//제외한 나머지 모든 포트
		try {
			serverSocket = new ServerSocket(20000);
			vc = new Vector<>();
			
			//메인 스레드는 소켓을 accept()하고 vector에 담는 역할을 함.
			while(true) {
				System.out.println("요청 대기");
				Socket socket = serverSocket.accept();
				System.out.println("요청 받음");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	class SocketThread extends Thread{
		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;
		
		public SocketThread(Socket socket) {
			this.socket=socket;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(),true);
				String line = null;
				while((line = reader.readLine())!=null) {
					System.out.println("from client :"+line);
					for(SocketThread socketThread : vc) {
						socketThread.writer.println(line);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					reader.close();
					writer.close();
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new SocketServer();
	}
}
