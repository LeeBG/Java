package ch03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"1","1","1","1","1","1","1","1","1","1"};

		for (int i = 0; i < name.length; i++) {
			name[i]=""+i;
			System.out.print(name[i]+" ");
		}
		System.out.println("");
		
		
		//반복문 -> 스택이 반복되는 것
		//초기값 i=1 (for문이 시작되기전 한번만 호출됨)
		//조건식은 i가 5보다 작을 때까지 반복하고
		//스택이 한 번 종료될 때마다 i가 1씩 증가
		
//		첫 번째 루프는 초기값 설정 및 조건 확인
//		두번째 루프 부터는  i값 변경 후 조건 확인(반복)
		for (int i=1;i<5;i++) {
			System.out.println("숫자: "+i);
		}
		
		System.out.println("--------------");
		for (int i = 4; i >= 1 ; i--) {
			System.out.println("숫자: "+i);
		}
		
		System.out.println("--------------");
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.println("숫자: "+i);
		}
		System.out.println("--------------");
		
		int count =0;
												//0부터 100까지의 수 중에서 3의 배수만 출력하시오.
		for (int i = 0; i <= 100; i++) {		//0부터 100까지 3의 배수 출력
			if(i%3==0 && i>0) {
				count+=1;
				System.out.println("3 x "+count+" = "+i);
			}		
		}
		System.out.println("--------------");
	}
		
	

}
