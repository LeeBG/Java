package ch04;

//�޼��� �ȿ� �޼��带 ������ �� ����.
//������ �ڷ��� ����� �����͸� ���� �� ����.
//������ �޼��带 ���� �� ����. java script
public class Method04 {

	int money = 10000; // heap �������� ����(int money)
	
	void add(int num) {	//stack (int num)
		money = money + num;
		
	}
	
	int add2(int num) {
		int money2 = money + num;
		return money2;
	}
	//ctrl + shift + Enter >> auto Formmat
	
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);			//add
		/*--------------------------------*/
		System.out.println(m.add2(30000));		//add2
	}
}
