package ch05;
//1.�������̽��� new�� �� ����.
//2.�������̽��� ������ ���� �� �ִ�.
//3.�������̽��� �߻� �޼��带 ������.
//4.�������̽��� �������� �޼��带 ������ ����.
//5.�������̽��� �����ϴ� Ŭ������ �ݵ�� �������̵� �ؾ��Ѵ�.

interface Remocon{
	String name = "������";	//�������� public static final �� �������ִ�. static�� �ƴϸ� ������ �� ����.
							//(public)�ܺο��� ã�� �� ������ final(���)�̱� ������ ������ �Ұ��� �ϴ�.
	public abstract void control();		//�߻� �޼���� public�� ���� 
}
public class Interface01 {
	
	final static String name ="������";				//�Ϲ����� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
