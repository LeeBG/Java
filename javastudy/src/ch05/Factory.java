package ch05;

public abstract	class Factory {
	protected abstract void ��ĥ();	//�Ϲ�Ŭ���������� abstract���� ����
	protected void ����() {
		System.out.println("���� �Ϸ�");
	}
	//protected �� ���� ��Ű�� + �ڽĸ� ���
	//protected �� �ڽĸ� ã�� �� �ֵ��� ��������
	public void ����() {
		��ĥ();
		����();
	}
}
