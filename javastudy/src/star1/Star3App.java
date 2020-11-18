package star1;

public class Star3App {

	//Zealot Dragon Tank SCV DarkTempler => StarUnit
	
	public static void main(String[] args) {
		StarUnit r = new River();
		StarUnit d = new Dragoon();
		StarUnit z = new Zealot();
		r.attack(d);
		d.attack(r);
		r.attack(d);
		r.upgrade();
		r.attack(z);
	}

}
