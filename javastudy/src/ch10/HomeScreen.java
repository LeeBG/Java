package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class HomeScreen extends JFrame {
	private LoginScreen loginScreen;
	private HomeScreen homeScreen=this;
	private JLabel laUsername;
	public HomeScreen(LoginScreen loginScreen) {
		this.loginScreen=loginScreen;
		
		laUsername = new JLabel(loginScreen.getTfUsername().getText());
		
		Container c = getContentPane();
		c.add(laUsername,BorderLayout.WEST);
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		
		setVisible(true);
	}

	public HomeScreen() {
		this(null);
	}
}
