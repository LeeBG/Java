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

	private ChatClient chatClient = this; 		// �ڽ��� context�� ����� ����
	private final static String TAG = "ChatClient : ";

	private final static short PORT = 10000; 	// ��Ʈ��ȣ
	private Socket socket; 						// ����
	private PrintWriter writer;
	private BufferedReader reader;
	private int countId;						//id���� ���� ī��Ʈ = 0�̴�.
	private JButton btnConnect, btnSend;		//��ư
	private JTextField tfHost, tfChat;			
	private JTextArea taChatList;
	private ScrollPane scrollPane;
	private JPanel topPanel, bottomPanel;

	public ChatClient() {						//JFanel ������
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
		tfHost = new JTextField("127.0.0.1", 20); 	// �ּ�, Font size
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
		setLocationRelativeTo(null);// ���������� â�� ���
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
			// �������Ͽ� ����
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

	private void send() {			//writer������

		
		String chat = tfChat.getText();		//�޽��� �ޱ�
		
		if(countId==0)
		{
			taChatList.append("[ID] " + chat + "\n");
			writer.append(chat+"\n");
			writer.flush();
			countId++;
		}else if(countId > 0) {
			// 1�� taChatList �Ѹ���
			taChatList.append("[���޽���] " + chat + "\n");
			// 2�� ������ ����
			writer.append(chat+"\n");
			writer.flush();
		}
		// 3�� tfChat ����
		tfChat.setText("[ALL]");
	}

	
	private void connect() {
		try { // host�� ���� ����
			
			String host = tfHost.getText();
			socket = new Socket(host, PORT);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			if(countId == 0)		//���̵� ī��Ʈ��  0�̸� id�� �޴´�.
				taChatList.append("���̵� �Է��ϼ���"+"\n");
			btnSend.setEnabled(true);
			//�޽��� �޴°Ÿ� 
			ReaderThread rt = new ReaderThread();
			rt.start();	
		} catch (Exception e1) {
			System.err.println(TAG + "���� ���� ����" + e1.getMessage());
		}
		
	}

	class ReaderThread extends Thread {
		// while�� ���鼭 ������ ���� �޽����� �޾Ƽ� taChatList�� �Ѹ���
		@Override
		public void run() {
			// reader.readLine(""); ���
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
