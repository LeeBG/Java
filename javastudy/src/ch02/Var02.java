package ch02;
// �ڹٴ� .class������ �����ϸ� static�κ��� �޸𸮿� �ε��Ѵ�.
// static ������ �ִ� main()�Լ��� ã�Ƽ� ȣ���ϰ�
// �̶� stack�� ���� �Ǵ� �� �� stack�� �̸��� main�̶�� �Ѵ�.
// main�� stack ���� �Ǹ� ���α׷� ����!!

public class Var02 {
	public static void main(String[] args) {
		//code
		
		//�������κ�
		
		int num = 2147000000;	// 4byte - 32��Ʈ ���� -21�� ~ 21��
		short num2=32111; 		//����short���� 2byte
		long num3 = 10; 		//long type - 8byte ū ���ڸ� ����
		
		//����
		char s = 'A';			//char - 2byte ����� �ѱ� ���� ���� �߱���(3����Ʈ)�Ұ�
		
		//�Ǽ�
		double d = 7.5;			//double - 8����Ʈ 42�� (-21�� + 21�� ) �߰��� �Ҽ������� ���尡��

		//�� ����
		boolean b = true;		//1bit ��1 ����0
		
		// ������ �Ѿ�� type int is out of range ���� �߻�
		System.out.println(num);
		num=num2;				//[������ ����ȯ] ��ĳ����
								//�ݴ�� ū ������ Ÿ���� ���� ������ Ÿ�Կ� �ִ°��� �ȵ�
		num2=(short)num;		//�ٿ� ĳ�������� ����
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
		num = (int)d;			//����� ����ȯ �Ҽ��� ǥ�� �Ұ��� type�̱� ������ ������ �ս�
								//�ٿ� ĳ����
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(b);
		
	}//end of main
}//end of class
