package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	private ServerSocket serversocket = null;	//��Ʈ�� ���� ����
	private Socket socket = null;				//ä���� ���������� �ϴ� ����
	private BufferedReader reader =null;		// �޴� ����
	
	public SocketServer() {
	
		try {
			serversocket = new ServerSocket(10000);	//��Ʈ����
			
			//Ŭ���̾�Ʈ�� ���� ���� ���
			System.out.println("Ŭ���̾�Ʈ�� ���� ���� �����.");
			socket = serversocket.accept();	//�����Ҷ����� ���
			System.out.println("��û�� ������");
			
			//system.in (Ű���� ��û), con.getInputstream(),
			//socket.getInputstream()
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = null;
			
			//���� ������ ����
			while((line = reader.readLine())!=null) {
				System.out.println("Ŭ���̾�Ʈ : "+line);
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
