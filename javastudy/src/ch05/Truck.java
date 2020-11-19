package ch05;

public class Truck extends Car implements Control{
	private String name;
	private Engine5000 engine5000;

	@Override
	public void ¾×¼¿() {
		System.out.println("ÀüÁø");
	}

	@Override
	public void ºê·¹ÀÌÅ©() {
		System.out.println("¸ØÃã");
	}
}
