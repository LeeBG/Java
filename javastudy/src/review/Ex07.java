package review;

/**
 * 
 * @author �̺���
 * static�� main�� �����ϱ� ���� �޸𸮿� �ε��ȴ�.
 * �� ���� static �����ʹ� �ߺ��� �� ����.(�� �� ���� �޸𸮿� �ε��Ǳ� ����!!)
 * �ΰ��� �޸𸮿� �� �� ���� => static �����ʹ� ������ �� �ִ� ������!
 * 
 * Heap�� new �� �� �޸𸮿� ���. Ÿ�̹��� ������ static ���� ����
 * �����ڰ� ���ϴ� ��ŭ �޸𸮿� �ε��� �� ����.
 * ���������Ͱ� �ƴϰ� ������ �����͸� ���� ������ ����.
 * �ڵ��� ���忡�� �ҳ�Ÿ�� 3�븦 ���� �ǸŸ� �ϸ� 3���� �ҳ�Ÿ�� �ٸ� �ҳ�Ÿ
 */

public class Ex07 {
	int num = 10;			//�ȶ� new �ؾ� ��(heap����, �ʵ�, ������Ƽ(�Ӽ�))
	static int sum = 20;	// main�� ���۵Ǳ� �� ��.
	
	public static void main(String[] args) {
		
		System.out.println(Ex07.sum);
		Ex07 e = new Ex07();
		System.out.println(e.num);
		
	}
}
