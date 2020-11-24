package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LoginScreen extends JFrame{
	//현재 자기자신 this 컨텍스트 = 변태 = 스토커 컨텍스트 넘기는 것이 가장 편하다
	private LoginScreen loginScreen = this;		
	private JTextField tfUsername;
	private JButton btnLogin;

	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("로그인");
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c = getContentPane();
		c.add(tfUsername,BorderLayout.CENTER);
		c.add(btnLogin,BorderLayout.SOUTH);
		initListener();
		
		setVisible(true);
	}
	
	//리스너 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if(username.equals("ssar")) {
					loginScreen.setVisible(false);
					new HomeScreen();
					//this. >> 익명 클래스이기 때문에 this.불가능 this는 익명 클래스
				}else {
					System.out.println("로그인 실패 : 아이디를 다시 입력하세요");
				}
			}
		});
	}
	public LoginScreen getLoginScreen() {
		return loginScreen;
	}

	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
}
