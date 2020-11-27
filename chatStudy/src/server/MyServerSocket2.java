package server;

//양방향

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerSocket2 {
	private ServerSocket serverSocket;
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyServerSocket2() {
		// 키보드로 부터 입력받은 후 쓰는 쓰레드
		class WriteThread implements Runnable {
			@Override
			public void run() {
				while (true) {
					String input = sc.nextLine();
					try {
						writer.write(input + "\n");
						writer.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("클라이언트 요청 대기 중...");
			socket = serverSocket.accept(); // 대기 데몬으로 리스닝 중 (block)
			System.out.println("요청이 성공함");

			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			sc = new Scanner(System.in);

			// 읽을 것이기 때문에 getInputStream
			String input = null;
			
			Thread t1 = new Thread(new WriteThread());		//타겟을 WriteThread로 잡음
			t1.start();
			
			while ((input = reader.readLine()) != null) {
				System.out.println("클라이언트 메시지:" + input);
				writer.write("잘받았어"+"\n");
				writer.flush();
			}
			
			writer.close();
			socket.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyServerSocket2();
	}
}
