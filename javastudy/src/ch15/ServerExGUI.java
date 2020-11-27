package ch15;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;

public class ServerExGUI extends JFrame{
	public ServerExGUI() {
		setTitle("chatClient");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = new Container();
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		ServerExGUI seg = new ServerExGUI();
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();	//Ŭ���̾�Ʈ in���κ��� �����б�
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ: "+inputMessage);
				System.out.println("������ >>");//������Ʈ
				String outputMessage = scanner.nextLine();
				out.write(outputMessage+"\n");
				out.flush();//�������� out��Ʈ�� ������ ��� ���ڿ� ����
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e2) {
				System.out.println("Ŭ���̾�Ʈ���� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
		
	}
}
