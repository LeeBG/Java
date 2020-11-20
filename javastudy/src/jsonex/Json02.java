package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		
@AllArgsConstructor
@NoArgsConstructor
class Reply{

	private Integer id;
	private String content;
}

public class Json02 {

	public static void main(String[] args) {
		Reply r = new Reply();
		r.setId(1);
		r.setContent("´ñ±Û");
		Gson g =  new Gson();
		String reply = g.toJson(r);
		System.out.println(reply);
		
		Reply r2 = g.fromJson(reply, Reply.class);
		System.out.println(r2.getId());
		System.out.println(r2.getContent());
			
	}

}
