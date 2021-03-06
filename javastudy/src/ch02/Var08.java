package ch02;

// heap
class Zealot{
	String name ="질럿";		//Static은 처음부터 뜨고
	int attack = 10;
	int armor =5;
	static int hp = 100;
}

public class Var08 {
	 public static void main(String[] args) {
		 
		Zealot z = new Zealot();	//static 이 안붙어있는 것들을 heap 메모리에 뜸
		Zealot z2 = new Zealot();	//static 이 안붙어있는 것들을 heap 메모리에 뜸
		
		System.out.println("----z1----");
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		z2.name="발업질럿";
		z2.attack=16;
		z2.armor=6;
		System.out.println("----z2----");
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack =50;		//바뀌면 같은 zealot모두 hp가 바뀐다.
		
		System.out.println("----------");
		System.out.println("z변화 관찰");
		System.out.print("질럿1 공격력:");
		System.out.println(z.attack);
		System.out.print("질럿2 공격력:");
		System.out.println(z2.attack);
		
		System.out.println("--질럿 체력 50--");
		Zealot.hp =50;
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//포지 업그레이드
		System.out.println("--공격력 업글--");
		z.attack = 11;		//이런 경우는 모든 질럿의 공격력이 업그레이드 되기 때문에 static으로 선언할 것!
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}
}
