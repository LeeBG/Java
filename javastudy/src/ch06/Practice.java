package ch06;

public class Practice {
	public static void main(String[] args) {

		String str3 = new String("   abcd");
		String str4 = new String(",efgh    ");
		
		System.out.println(str3.concat("efg"));//�� ���̱�

		System.out.println(str3.charAt(6));		// 2�ּҿ� 
		
		String str5 =str3.concat(str4);
		System.out.println(str5);
		
		String str6 = str3.trim();
		System.out.println(str6);
		
		String str7 = str3.replace("abcd","dcba");
		System.out.println(str7);
		
		String[] str8 = str5.split(",");
		for(int i=0;i<str8.length;i++)
			System.out.println("�и��� ���ڿ�"+i+":"+str8[i]);
		
		String str9 = str5.substring(5);			//�ε��� 5���� ������
		System.out.println(str9);
		
		char c = str5.charAt(3);
		System.out.println(c);
	}
}
