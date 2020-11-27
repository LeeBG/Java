package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {
	private Socket socket;
	public MyClientSocket() {
		try {
			socket = new Socket("127.0.0.1",10000);
			Scanner sc = new Scanner(System. in);
			//키보드로 입력받아서
			//소켓에 버퍼 달기
			BufferedWriter bw= 
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String input = sc.nextLine();
				bw.write(input+"\n");
				bw.flush();		//스트림에 전송
			}
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MyClientSocket();
	}
}
