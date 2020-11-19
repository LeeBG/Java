package ch05;

public class FactoryApp {

	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
		f1.색칠();			//동적바인딩
		f1.건조();			//동적바인딩아님
							//순서의차이로 인해 실수할 수 있다.
	}	

}
