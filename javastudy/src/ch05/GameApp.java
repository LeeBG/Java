package ch05;

public class GameApp {

	static void start(Control c) {
		c.액셀();
		c.브레이크();
	}
	public static void main(String[] args) {
		Sonata s = new Sonata();
		start(s);
		
		Genesis g = new Genesis();
		start(g);
	}

}
