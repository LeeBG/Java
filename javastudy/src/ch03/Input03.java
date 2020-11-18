package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		//문자를 숫자로 받음
		InputStreamReader ir = new InputStreamReader(in);
		//문자를 여러개를 못보냄
		BufferedReader br = new BufferedReader(ir);
		//버퍼 : 데이터를 가변적으로 받을 수 있다.
		
		try {	//통신에는 항상 예외가 일어날 수 있기 때문에
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
