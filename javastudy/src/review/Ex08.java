package review;

//�޼���� �Ű����� �μ� 

public class Ex08 {
	void add(int n1, int n2) { 	// void return �� ���� ()�� �Լ���� �� n1 n2 �� �Ű�����(arguments)
		System.out.println(n1 + n2);
	}

	int minus(int n1, int n2) {
		return n1 - n2;			//�Լ��� ȣ���� ������ ���� n1-n2�� �����.
	}

	public static void main(String[] args) {
		Ex08 e = new Ex08();
		// 3�� 6�� �μ���� �Ѵ�.
		e.add(3, 6);// �Լ��� ȣ��(11�� ���ο��� 6���������� ����)
		int result = e.minus(10, 5);
		System.out.println(result);
	}
}
