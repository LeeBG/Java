package ch03;

import java.io.IOException;
import java.io.InputStream;

public class Input02 {

	public static void main(String[] args) {
		//I/O 장치중에 Input되는 장치의 선에 접근해서
		//1Byte 데이터를 읽어주는 클래스
		InputStream in = System.in;		
		//System.in - 컴퓨터로 입력되는 모든 선(키보드)
		try {
			int num = in.read();
			System.out.println("입력받은 값 :" +num);//실행시 ASCII 값이 출력
			System.out.println((char)num);
		} catch (IOException e) {
			// 키보드 연결이 끊긴다던지 수많은 예외상황이 발생할 수 있음
			System.out.println("괜찮아");
		}
		
	}

}
