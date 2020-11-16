package star1;

public class Star1App {

	// 질럿 - > 드라군 때림
	static void attack(Zealot u1, Dragoon u2) {	//attack의 지역 변수 (stack)
		System.out.println(u1.name+" -> "+u2.name+" 공격");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	// 드라군 - > 질럿 때림
	static void attack(Dragoon u1, Zealot u2) {	//attack의 지역 변수 (stack)
		System.out.println(u1.name+" -> "+u2.name+" 공격");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	
	// 드라군 - > 드라군 때림
	static void attack(Dragoon u1, Dragoon u2) {	//attack의 지역 변수 (stack)
		System.out.println(u1.name+" -> "+u2.name+" 공격");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	static void attack(DarkTempler u1, Dragoon u2) {	//attack의 지역 변수 (stack)
		System.out.println(u1.name+" -> "+u2.name+" 공격");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}
	static void attack(DarkTempler u1, Zealot u2) {	//attack의 지역 변수 (stack)
		System.out.println(u1.name+" -> "+u2.name+" 공격");
		u2.hp -= u1.attack;
		System.out.println(u2.name+" hp:" + u2.hp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z1 = new Zealot("질럿1", 100, 16); // z1은 main안의 지역변수
		Dragoon d1 = new Dragoon("드라군1", 120, 20); // d1도 마찬가지로 지역변수
		Dragoon d2 = new Dragoon("드라군2",120, 20);	
		DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 40);
		DarkTempler dt2 = new DarkTempler("다크템플러2", 100, 40);
		
		//Overloading >> 함수이름이 같아도 매개변수의 타입이나 갯수가 다르다면 함수 가능(과적재)
		attack(z1, d1);
		attack(d1,z1);
		attack(d1, d2);
		
		//다크 템플러1 질럿 1을 공격
		attack(dt1,z1);
		//다크 템플러2 드라군 1을 공격
		attack(dt2,d1);
		System.out.println();

	}

}
