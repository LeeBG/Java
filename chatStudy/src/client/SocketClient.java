package client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


//v1 �Ϲ��� ���


public class SocketClient {
	private Socket socket= null;
	private PrintWriter writer = null;
	
	public SocketClient() {
		try {
			//������ acceptȣ��	//127.0.0.1/�缳 ip / localhost
			socket = new Socket("localhost",10000);
			
			//���� �޽����� ������ ������ output ���Ͽ��� ��Ʈ�� 
			writer = new PrintWriter(socket.getOutputStream());
			
			// Ŭ���̾�Ʈ�� ���� �Է¹ޱ�
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
