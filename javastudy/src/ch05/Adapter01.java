package ch05;

interface Knife{	//Į 
	void �丮();
//	default void  ����() {};			//default�� ���̸� �������� �������� 
	void  ����();						//interface���� �Լ� ���� �� �� ����
}
//����� �뵵 : �������̽� �Ÿ��� �뵵
abstract class �丮��Adapter implements Knife{
	public void ����() {}
}

class ������ extends �丮��Adapter{
	@Override
	public void �丮() {
		// TODO Auto-generated method stub	
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}
}
