package ch02;

public class Oper01 {

	public static void main(String[] args) {
		
		System.out.println(1+1);
		System.out.println(1+"1");
		
		int num = 10;
		String s = "5";
		
		String sum = num +s;//Type�� String���� ��.
		System.out.println(sum);
		
		System.out.println(10-5);
		System.out.println(10/3); //Ÿ���� int �Ѵ� int�̱� ����
		
		System.out.println(10.0/3);	//double / int �̹Ƿ� ����� Ÿ���� ū ������ ����
		System.out.println(10%3); 	//���� ������ ����
		System.out.println(10*3);	//��
	}//end of main
}//end of oper01 class
