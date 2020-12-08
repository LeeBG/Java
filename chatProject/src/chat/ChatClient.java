package chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {

	private ChatClient chatClient = this; 		// 자신의 context를 만들기 습관
	private final static String TAG = "ChatClient : ";

	private final static short PORT = 10000; 	// 포트번호
	private Socket socket; 						// 소켓
	private PrintWriter writer;
	private BufferedReader reader;
	private int countId;						//id최초 생성 카운트 = 0이다.
	private JButton btnConnect, btnSend;		//버튼
	private JTextField tfHost, tfChat;			
	private JTextArea taChatList;
	private ScrollPane scrollPane;
	private JPanel topPanel, bottomPanel;

	public ChatClient() {						//JFanel 생성자
		init();
		setting();
		batch();
		listener();
		setVisible(true);
	}
	
	private void init() {
		countId=0;
		btnConnect = new JButton("connect");
		btnSend = new JButton("send");
		tfHost = new JTextField("127.0.0.1", 20); 	// 주소, Font size
		tfChat = new JTextField("", 20);
		taChatList = new JTextArea(20, 30); 		// row, column
		scrollPane = new ScrollPane();
		topPanel = new JPanel();
		bottomPanel = new JPanel();
	}

	private void setting() {
		setTitle("MyChat1.0 [" + "]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 500);
		setLocationRelativeTo(null);// 실행했을때 창이 가운데
		taChatList.setBackground(Color.ORANGE);
		taChatList.setForeground(Color.BLUE);
		if(countId==0)
			btnSend.setEnabled(false);
	}

	private void batch() {
		topPanel.add(tfHost);
		topPanel.add(btnConnect);
		bottomPanel.add(tfChat);
		bottomPanel.add(btnSend);
		scrollPane.add(taChatList);

		add(topPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	private void listener() {
		btnConnect.addActionListener(new ActionListener() {
			// 서버소켓에 연결
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
			}
		});
		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
	}

	private void send() {			//writer쓰레드

		
		String chat = tfChat.getText();		//메시지 받기
		
		if(countId==0)
		{
			taChatList.append("[ID] " + chat + "\n");
			writer.append(chat+"\n");
			writer.flush();
			countId++;
		}else if(countId > 0) {
			// 1번 taChatList 뿌리기
			taChatList.append("[내메시지] " + chat + "\n");
			// 2번 서버로 전송
			writer.append(chat+"\n");
			writer.flush();
		}
		// 3번 tfChat 비우기
		tfChat.setText("[ALL]");
	}

	
	private void connect() {
		try { // host의 값을 받음
			
			String host = tfHost.getText();
			socket = new Socket(host, PORT);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			if(countId == 0)		//아이디 카운트가  0이면 id를 받는다.
				taChatList.append("아이디를 입력하세요"+"\n");
			btnSend.setEnabled(true);
			//메시지 받는거만 
			ReaderThread rt = new ReaderThread();
			rt.start();	
		} catch (Exception e1) {
			System.err.println(TAG + "서버 연결 에러" + e1.getMessage());
		}
		
	}

	class ReaderThread extends Thread {
		// while을 돌면서 서버로 부터 메시지를 받아서 taChatList에 뿌리기
		@Override
		public void run() {
			// reader.readLine(""); 사용
			try {
				String line = null;				
				while((line = reader.readLine())!=null) {
					taChatList.append(line+"\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new ChatClient();
	}

}
