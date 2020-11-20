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
	private String content;		//댓글 오브젝트
	//toString
}

public class Json01 {
	
	public static void main(String[] args) {
		//자바 -> JSON(String) 통신을 해야하기 때문에 스트링
		Comment ct1 = new Comment(1,"댓글1");
		//1.Gson객체를 만들어라 구글이 만든 객체
		Gson gson = new Gson();
		
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);	//<T> 클래스이름
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
		
		
	}
	//JSON(String) -> 자바
}
