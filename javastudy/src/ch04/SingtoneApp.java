package ch04;

//������ ���� : �̱��� ����>> ��ü�� �� �ѹ��� ����� ����
//heap�� �̱������� �����ϸ� ������ �� �ִ�.
class President{
	
	static President instance = new President();		//main�������� �������� ���
	private President() {		//�̷��� ������ ȣ�� �Ұ���
		
	}
	public static President getInstance() {
		return instance;
	}
}
public class SingtoneApp {

	public static void main(String[] args) {
		
		President p = President.getInstance();
		
	}

}
