package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		Person p1 =  new Person("�ֽ���","�ǻ�",45,'��',"A");		//�μ����� ������
		//ctrl + Ŭ���� �̸� Ŭ��

		//Ŭ������ �μ����� ()�� ������ �⺻ �����ڷ� �������� Default�� ���������� ��) public Person()
		
		Person p2 =  new Person("�̹̳�","��������",28,'��',"O");		//�μ����� ������
		Person p3 =  new Person("��̳�","����",47,'��',"AB");		//�μ����� ������
		p1.preview();
		p2.preview();
		p3.preview();
	}

}
