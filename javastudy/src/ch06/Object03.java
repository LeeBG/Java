package ch06;

public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1==str2);
		
		int num = 10;
		//���� �������� �޸� ������ ������ ��
		String str3 = "�Ӳ���";				//Constant Pool
		String str4 = new String("�Ӳ���");	//Heap
//		�������ϸ� �ٸ��� �ؽ����� ����.

		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3==str4);		//==�� �ּҺ� �ٸ��ּ� false ���
		
		System.out.println(str3.equals(str4));
		// == ���� ���� ���ϰ� ������ ��
		// == ���� ���ߴµ� false�� ������ reference ���������� ���� ��
		// �Ϲ������� ���ڿ��񱳴� .equals ���� �ٸ� Ÿ�Ե��� == ���� ��
		//String�� Hash�Լ��� Overiding �ż� ���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
	}

}