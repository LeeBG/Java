package test;

import ch05.BlueCloth;
import ch05.Factory;

public class FactoryApp {

	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
		f1.가동();			//동적바인딩아님
							//순서의차이로 인해 실수할 수 있다.
	}	
	
}
