package ch07;

import java.util.Vector;

// vector�� ����ȭ �Ǿ� �ִ� �Ӱ豸��(�������� �Ұ���) Critical Section
// ����ȭ ���� ������ ����. 

public class Generic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> list1 = new Vector<>();
		//���� ArrayList�� �Ȱ���
		
		list1.add(100);
		list1.add(200);
		list1.add(1,300);		//index 1�� 300 �߰�
		
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
	}

}
