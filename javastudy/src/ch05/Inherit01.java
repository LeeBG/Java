package ch05;

class Father{
	int money = 10000;
//	1. ����� �����޴� �ǹ�(���������� �ؾ���)
	
}
class Son extends Father{
//	�ƹ��� �Ƶ� ����� ������ ���� �ȵ�
	int money = 20000;
	
}

public class Inherit01 {
	public static void main(String[] args) {
		Son s = new Son();		//s�� Father�� ����Ų��. �����ڴ� �ڽ�Son
		//���� �� ���� �� 
		System.out.println(s.money);		//������ ã�� �� �ڽĿ��� ���ٸ� �θ�� Ÿ�� �ö󰡼� ã��
//		1�� ������ ã�� �� ������ ������ �� ������ ��� ������ ������ �θ� ã�ƿö�
		
		Father f = new Son();
//		2�� new�� �ϸ� Father�� Son�� ���� ���.
//		�����ڴ� Son()�� ȣ���� �ȴ�.
//		����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		System.out.println(f.money);
	}
}
