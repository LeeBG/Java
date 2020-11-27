package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;		//���� �����尡 ���� �����ϱ�
	
	public MyClientSocket2() {
		try {
			socket = new Socket("127.0.0.1",10000);
			Scanner sc = new Scanner(System. in);
			//Ű����� �Է¹޾Ƽ�
			//���Ͽ� ���� �ޱ�
			BufferedWriter writer= 
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("������ ���� �� �޽���: " +input);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
			
			//���� ������� Ű����� ���� �Է��� ������ Ŭ���ξ�Ʈ ���Ͽ� ����
			while(true) {
				String input = sc.nextLine();
				writer.write(input+"\n");
				writer.flush();		//��Ʈ���� ����
			}
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyClientSocket2();
	}
}
