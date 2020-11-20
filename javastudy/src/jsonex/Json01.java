package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String content;		//��� ������Ʈ
	//toString
}

public class Json01 {
	
	public static void main(String[] args) {
		//�ڹ� -> JSON(String) ����� �ؾ��ϱ� ������ ��Ʈ��
		Comment ct1 = new Comment(1,"���1");
		//1.Gson��ü�� ������ ������ ���� ��ü
		Gson gson = new Gson();
		
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);	//<T> Ŭ�����̸�
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
		
		
	}
	//JSON(String) -> �ڹ�
}