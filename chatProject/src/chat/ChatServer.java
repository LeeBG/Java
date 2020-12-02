package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;
import chat.ChatProtocol;

public class ChatServer {

	private ServerSocket serverSocket;
	private static final  String TAG = "ChatServer : ";
	private Vector<ClientInfo> vc;						//����� Ŭ���̾�Ʈ (����)�� ��� �÷���
	private String id;
	public ChatServer() {
		/*
		 * 
		 */
		try {
			Scanner sc = new Scanner(System.in);
			vc = new Vector<>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG+"Ŭ���̾�Ʈ ���� �����");
			//����� ���ν������� ���� �����
			
			while(true) {
				Socket socket = serverSocket.accept();		//Ŭ���̾�Ʈ ������
				System.out.println(TAG+"Ŭ���̾�Ʈ ���� �Ϸ�");
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				id = reader.readLine();			//���̵� �ޱ�
				System.out.println("id = "+id);
				ClientInfo clientInfo = new ClientInfo(socket,id);
				clientInfo.start();
				vc.add(clientInfo);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//���Ϳ� ��� ���� ���� Ŭ���� 
	class ClientInfo extends Thread{
		Socket socket;					//���������ؼ� ������ ������ �־�� ��.
		BufferedReader reader;
		PrintWriter writer;				// BufferedWriter�� �ٸ� ���� �������� �Լ��� ��������
		String id;
		
		public ClientInfo(Socket socket,String id) {
			this.socket= socket;
			this.id = id;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
			} catch (Exception e) {
				System.err.println("���� ���� ����: "+e.getMessage());
			}
		}
		
		/*
		 * ���ο� �������� ���� : Ŭ���̾�Ʈ�� ���� ���� �޽����� ��� Ŭ���̾�Ʈ����
		 * �������Ѵ�.
		 */
		

		@Override
		public void run() {			//��������
			//�޽����� �о �� ��
			try {
				String input=null;
				while((input = reader.readLine())!=null) {
					routing(input);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private void routing(String input) {
			String gubun[] = input.split("]");
			
			if((gubun[0].substring(1)).equals(ChatProtocol.ALL)) {
				for(int i =0;i<vc.size();i++) {
					if(vc.get(i) != this) {
						vc.get(i).writer.append(gubun[1]+"\n");
						vc.get(i).writer.flush();
					}
				}
			}else if((gubun[0].substring(1)).equals(ChatProtocol.MSG)) {		//�ӼӸ�
				
				String tempId = gubun[1].substring(1);
				String tempMsg = gubun[2];
				
				for(int i = 0 ; i <vc.size();i++) {
					if(vc.get(i).id.equals(tempId+tempId)) {
						System.out.println(gubun[2]);
						vc.get(i).writer.append(tempMsg+"\n");
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
