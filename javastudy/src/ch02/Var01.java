package ch02;

//�ڹٴ� .class������ �����ϸ� static �κ��� �޸𸮿� �ε��Ѵ�.
// static ������ �ִ� main() �Լ��� ã�Ƽ� ȣ���ϰ�
//�� �� stack�� �����Ǵµ� �� stack�� �̸��� main�̶�� �Ѵ�.
// main�� stack����Ǹ� ���α׷� ����!!

public class Var01 {
	public static void main(String[] args) {
		// TODO code�κ�
		System.out.println("ù��°");
		System.out.println("�ι�°");
		
		int num = 7; //����int ���� 4byte
		
		/*
		 * 1.static�� �� ã�Ƽ� �޸𸮿� ���
		 * 2.main
		 * 
		 * ���α׷��� ������ ���� ������ 1�� �̻��� static�� �ʿ��ϴ�.
		 * static >> main �̶�� �̸��� static ������ �� ���δ� �޸𸮿� ���� �ʴ´�.
		 * �Լ� ������ ������ >> stack : �Լ��� ȣ������� ���ٰ� ȣ���� ����� �� �����
		 * JVM�� ȣ���ϴ� ��
		 * 
		 * */	
	}//end of main
}//end of class
