package ch15;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;

public class ClientExGUI extends JFrame {

	public ClientExGUI() {
		setTitle("chatClient");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = new Container();
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		ClientExGUI ceg = new ClientExGUI();
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);

		try {
			socket = new Socket("113.198.238.72",9999);		//localhost�� ���� (�ڱ��ڽ�)
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("������>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage+"\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("����:"+inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("�������� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

}
