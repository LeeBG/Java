package login;

interface OAuth {
	public abstract String oauthId();		//email�� ������ id
	public abstract String oauthPassword();	
	public abstract String oauthNick();	//username�̵� nickname�̵� ���Ͻ�Ų��.
	public abstract String oauthProvider();
}
