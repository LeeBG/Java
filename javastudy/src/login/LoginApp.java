package login;

public class LoginApp {

	static void userInfo(OAuth o) {
		System.out.println("로그인 한 사용자는...");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
		System.out.println(o.oauthProvider());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook();			//로그인 하면 알아서 만들어 줌
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);
	}

}
