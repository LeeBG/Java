package review;

class �����{
	String data;
	
	String �ٿ�ε�() {
		data = "GTA5 ����";				//������ ���α׷�
		try {
			Thread.sleep(3000);			//exception�� �߻��� �� �ִ�. �ü���� �߿��� �۾�����
										//���ͷ�Ʈ �߻� �� �� �ִ�.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("������ �ʾ�...");
		}	//1000 = 1��
		return data;
	}
}
public class Ex122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		����� s =  new �����();
		String game = s.�ٿ�ε�();
	
		System.out.println(game+"����");
	}
	
	//�������̽��� Ư¡ : Ÿ����ġ, ������, �ڹٿ����� �޼��带 �Լ��� �μ��� ������ �� ����.
	//�ڹٴ� �޼��带 �Լ��� �Ű������� �����ϰ� ������ ������ �������̽��� �Լ��� ��´�.
	//�͸�Ŭ������ �ѱ��.

}
