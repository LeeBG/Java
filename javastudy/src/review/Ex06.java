package review;

public class Ex06 {

	public static void main(String[] args) {
		int n1 = 100;
		double n2 = n1;		//upcasting (������ ����ȯ)
		//4����Ʈ�� 8����Ʈ�� ��´�. ���������Ͱ� ū ������ ���� ������ ���x�ص� �˴ϴ�.
		double n3 = 10.5;
//		int n4 = n3;		//�ٷ� ���� �� ����. ����: 8����Ʈ�����͸� 4����Ʈ�� �������ϱ� ������ �ȵ� 
		int n4 = (int)n3;	//�ٿ� ĳ���� (����� ����ȯ)
		//Ư¡ �� �����Ͱ� ���ǵ� �� ����
		System.out.println(n4);		//0.5 ������ ���� 
	}
}
