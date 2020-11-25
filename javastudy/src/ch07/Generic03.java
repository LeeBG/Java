package ch07;

import java.util.Vector;

// vector는 동기화 되어 있는 임계구역(동시접근 불가능) Critical Section
// 동기화 일의 순서가 있음. 

public class Generic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> list1 = new Vector<>();
		//사용법 ArrayList와 똑같음
		
		list1.add(100);
		list1.add(200);
		list1.add(1,300);		//index 1에 300 추가
		
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
	}

}
