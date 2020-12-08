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
	private Vector<ClientInfo> vc;						//����� Ŭ���̾�Ʈ (����)�� ��� �÷���
	private String id;									//�����忡�� �޴� ���̵� ��
	public ChatServer() {
		try {

			vc = new Vector<>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG+"Ŭ���̾�Ʈ ���� �����");
			
			//����� ���ν������� ���� �����
			while(true) {
				Socket socket = serverSocket.accept();		//Ŭ���̾�Ʈ ������
				System.out.println(TAG+"Ŭ���̾�Ʈ ���� �Ϸ�");
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
				id=null;
				id = reader.readLine();		//���̵� �ޱ�
				String input=null;
				while((input = reader.readLine())!=null) {
					routing(input);			//�������� �����
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
			}else if((gubun[0].substring(1)).equals(ChatProtocol.MSG)) {		//�ӼӸ�
				
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
