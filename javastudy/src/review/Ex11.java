package review;


// ����� �����͸� �����ִ� ���� ������ �ƴϴ�
// ���� �����͸� �����ְ� �ʹٸ� ���������ϸ� �ȴ�.
// ����� �ϴ� ������ �������� �ִ�.
// Type�� ��ġ ��Ŵ���μ� ���� ����� ���� �� �ִ�.

class ����{
	void start() {
	}
}
class �������� extends ����{
	@Override
	void start() {
		System.out.println("�������� ���");
	}
}
class ����å�� extends ����{
	@Override
	void start() {
		System.out.println("����å�� ���");
	}
}
public class Ex11 {

	static void use(���� u) {
		u.start();
	}
	
	public static void main(String[] args) {
		use(new ����å��());
		use(new ��������());
	}
}
