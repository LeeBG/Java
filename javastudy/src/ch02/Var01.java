package ch02;

//자바는 .class파일을 실행하면 static 부분을 메모리에 로드한다.
// static 공간에 있는 main() 함수를 찾아서 호출하고
//이 때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
// main에 stack종료되면 프로그램 종료!!

public class Var01 {
	public static void main(String[] args) {
		// TODO code부분
		System.out.println("첫번째");
		System.out.println("두번째");
		
		int num = 7; //정수int 형은 4byte
		
		/*
		 * 1.static을 다 찾아서 메모리에 띄움
		 * 2.main
		 * 
		 * 프로그램을 실행할 때에 무조건 1개 이상의 static이 필요하다.
		 * static >> main 이라는 이름이 static 공간에 뜸 내부는 메모리에 뜨지 않는다.
		 * 함수 내부의 내용은 >> stack : 함수가 호출시점에 떴다가 호출이 종료될 때 사라짐
		 * JVM이 호출하는 것
		 * 
		 * */	
	}//end of main
}//end of class
