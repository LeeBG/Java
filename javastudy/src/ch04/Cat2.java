package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//�ٸ� ��Ű���� ������ �´�.

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cat2 {
	private int age;
	private String name;
	//lombook�� ����ϸ� �ʵ带 �߰��Ͽ� ������ getter/setter�� �߰��� ���� �����ش�.
	private String color;
}
