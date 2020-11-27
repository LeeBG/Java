package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	private ServerSocket serverSocket;
	private Socket socket;
	
	public MyServerSocket() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("Ŭ���̾�Ʈ ��û ��� ��...");
			socket = serverSocket.accept();			//��� �������� ������ �� (block)
			System.out.println("��û�� ������");
			
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//���� ���̱� ������ getInputStream
			String input = null;
			while((input = reader.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ �޽���:"+input);
			}
			socket.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyServerSocket();
	}
}
