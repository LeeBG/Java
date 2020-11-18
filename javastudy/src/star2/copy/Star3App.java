package star2.copy;

public class Star3App {

	//Zealot Dragon Tank SCV DarkTempler => StarUnit
	public static void unitInfo(StarUnit u) {			//공격 행위(메소드=함수) public = 클래스 외부에서 쓸수있음
		System.out.println("유닛이름:"+u.getName());
		System.out.println("유닛체력:"+u.getHp());
		System.out.println("유닛공격력:"+u.getAttack());
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		River r = new River();
		Dragoon d = new Dragoon();
		Zealot z = new Zealot();
		r.attack(d);
		d.attack(r);
		r.attack(d);
		r.upgrade();
		r.attack(z); 
		unitInfo(r);
		unitInfo(z);
		unitInfo(d);
		
	}

}
