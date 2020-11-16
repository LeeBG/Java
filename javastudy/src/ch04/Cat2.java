package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//다른 패키지를 수입해 온다.

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cat2 {
	private int age;
	private String name;
	//lombook을 사용하면 필드를 추가하여 생성자 getter/setter를 추가할 수고를 덜어준다.
	private String color;
}
