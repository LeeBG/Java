package review;
//stack �� ��������

public class Ex09 {
//	���� : �Լ����� ������ ����
//	���� : �Լ��� ȣ���
	int add() {	//�Լ� ���� = �߰�ȣ{} ���� ={} = stack�� ���µȴٰ� ��.(�Լ��� ȣ���� ��)
					//stack�� ���µ�����, �޸𸮰� Ȱ��ȭ �ƴٴ� �� �ƴ�.	
		int n1 =10;	//�� �� stack�� 4byte�� �Ҵ��� ��. add()�Լ� stack�� �Ҵ��
		return n1;
	}//�Լ����� => ���� �� ���� = stack�� �����. = ������ ������ = ��������
	
	public static void main(String[] args) {
		Ex09 e = new Ex09();
		e.add();		//n1�� �޸𸮿� ������.
	}
}
