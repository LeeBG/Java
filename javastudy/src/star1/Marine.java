package star1;

/**
 * @author dita_808
 *
 */
class Marine{
	
	//�������:�ʵ�:heap����:��������:�Ӽ�:������Ƽ
	//field , property �� private ���� X(������ ���ؼ� ���¸� ��ȭ ��Ű�� ����)
	
	private String name;		//������ ���� Ŭ����
	private int hp;
	private int attack;
	
	//Alt + Shift + S				//source ����Ű
	//this �� heap�� ����Ų��.
	
	public Marine(String name, int hp, int attack) {
		this.name = name;			//this.�ʵ� => �������� this�� ���� ���������� �˾Ƹ���
		this.hp = hp;				//������ ������ �ִ� ���� ã�� ������ this(�� ����)
		this.attack = attack;
	}
	
	public Marine() {
		// TODO Auto-generated constructor stub
	}
	
	   
}
