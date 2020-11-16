package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		Person p1 =  new Person("최승희","의사",45,'여',"A");		//인수없는 생성자
		//ctrl + 클래스 이름 클릭

		//클래스명에 인수없는 ()가 있으면 기본 생성자로 생략가능 Default로 생성돼있음 에) public Person()
		
		Person p2 =  new Person("이미녀","골프선수",28,'여',"O");		//인수없는 생성자
		Person p3 =  new Person("김미남","교수",47,'남',"AB");		//인수없는 생성자
		p1.preview();
		p2.preview();
		p3.preview();
	}

}
