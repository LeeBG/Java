package ch05;

public class Genesis extends Car implements Control{

	private String name;
	private Engine2000 engine2000;
	
	@Override
	public void ¾×¼¿() {
		System.out.println("ÀüÁø");
	}

	@Override
	public void ºê·¹ÀÌÅ©() {
		System.out.println("¸ØÃã");
	}
}
