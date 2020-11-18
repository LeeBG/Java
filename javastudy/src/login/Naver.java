package login;

public class Naver implements OAuth{
	
	private String Provider;
	private String password;
	private String nickname;
	private String id;
	
	public Naver() {
		this("naver","ssar@nate.com","1234","±úºÀ³×ÀÌ¹ö");
	}

	public Naver(String provider, String password, String nickname, String id) {
		Provider = provider;
		this.password = password;
		this.nickname = nickname;
		this.id = id;
	}

	public String getProvider() {
		return Provider;
	}

	public void setProvider(String provider) {
		Provider = provider;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return nickname;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return Provider;
	}
	
	
	
}
