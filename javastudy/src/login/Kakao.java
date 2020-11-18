package login;

public class Kakao implements OAuth{

	private String Provider;
	private String id;
	private String pass;
	private String name;
	
	public Kakao() {
		this("朝朝神","ssar","1234","凹裟朝朝神");
	}

	public Kakao(String provider, String id, String pass, String name) {
		super();
		Provider = provider;
		this.id = id;
		this.pass = pass;
		this.name = name;
	}

	public String getProvider() {
		return Provider;
	}

	public void setProvider(String provider) {
		Provider = provider;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return pass;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return Provider;
	}
	
	
	
}
