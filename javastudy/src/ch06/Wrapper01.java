package ch06;

public class Wrapper01 {
	public static void main(String[] args) {
		int num = 10;			//4����Ʈ ������ �Ҵ�
		Integer num2 = 10;		//���۷��� ���� - �ּ�
		
		String num3 =num2.toString();	//toString�� ��� ������Ʈ�� ���ڷ� �ٲ�
		System.out.println(num3);
		
		
//		String num4 = num +"";// ���1
		String num5 = "10";
		int num6 = Integer.parseInt(num5);		//���־��� �Լ��� static���� ���� new���� �ʾƵ� ��
		System.out.println(num6);
	}
}
