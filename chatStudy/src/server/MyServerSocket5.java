package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import protocol.Chat;

//�ٴ�� ����� ���

public class MyServerSocket5 {
	
	private ServerSocket serverSocket;
	Vector<SocketThread> vc;	//��⿭(ť) �ٸ� �����ڿ��� ����ϱ� ������ private X
	
	
	public MyServerSocket5() {
		try {
			serverSocket = new ServerSocket(10000);
			vc= new Vector<>();
			int num =1;
			while(true) {		//accept�ؾ���
				System.out.println("��û ����� ...");
				Socket socket =  serverSocket.accept();
				//1. ���ο� ���� ���� socket
				//2. ���ο� ������ ����
				//3. ���ο� ���������� socket������ �ѱ�� �ȳѱ�� ��� ���� socket�� �־�� ���
				//4. ���ο� ������ ��ü�� vc�� ���
				System.out.println("��û ���� ...");
				SocketThread st = new SocketThread(socket,"bg"+num);
				st.start();
				vc.add(st);		//Ŭ������ ���Ϳ� ��´�.
				num++;
			}
		} catch (Exception e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();		//�������� ������ �����ؼ� �޽����� �ѷ���
		}
	}
	class SocketThread extends Thread{		//�ٸ� ���¸� �����ϱ� ����
		private Socket socket;
		private String id;
		private BufferedReader reader;
		private PrintWriter writer;
		
		
		public SocketThread(Socket socket,String id) {
			this.socket = socket;
			this.id = id;
		}

		@Override
		public void run() {
			//���� ������ ��ü�� �ѱ�� .
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				
				String input = null;								//���� �޽���
				while((input = reader.readLine()) != null) {
					// Routing (����� �ϱ�)
					// ALL ���� MSG���� �����ؼ� ����
					routing(input);						//input�� ����� �� �����ϴ� �޼��� 
					
//					for(int i=0;i<vc.size();i++) {		//�ڱ��ڽ����� ��� �����忡 ����
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
			if(gubun[0].equals(Chat.ALL)) {
				for(int i = 0;i<vc.size();i++) {
					if(vc.get(i) != this) {			//�ڽ��� ������ ��ο���
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
		}
	}//End of SocketThread
	public static void main(String[] args) {		//������ �߰�� ���� : ����� �����忡..
		
		new MyServerSocket5();
	}
}
