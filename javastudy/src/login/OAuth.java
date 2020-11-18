package login;

interface OAuth {
	public abstract String oauthId();		//email을 가져도 id
	public abstract String oauthPassword();	
	public abstract String oauthNick();	//username이든 nickname이든 통일시킨다.
	public abstract String oauthProvider();
}
