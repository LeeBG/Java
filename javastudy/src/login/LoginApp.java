package login;

public class LoginApp {

	static void userInfo(OAuth o) {
		System.out.println("�α��� �� ����ڴ�...");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
		System.out.println(o.oauthProvider());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook();			//�α��� �ϸ� �˾Ƽ� ����� ��
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);
	}

}
