package login;

//oAuth -> Open Auth ¿Œ¡ı¿ª ø¿«¬«—¥Ÿ. facebook¿ª naver ∞Ë¡§¿∏∑Œ

public class Facebook implements OAuth{
	
	private String Provider;
	private String email;
	private String password;
	private String username;
	
	
	public Facebook() {
		this("Facebook","ssar@nate.com","1234","±˙∫¿∆‰¿ÃΩ∫∫œ");
	}

	public Facebook(String provider, String email, String password, String username) {
		Provider = provider;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getProvider() {
		return Provider;
	}

	public void setProvider(String provider) {
		Provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return Provider;
	}

	
}
