package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {

	public String getData() {
		InputStream in = System.in;
		//문자를 숫자로 받음
		InputStreamReader ir = new InputStreamReader(in);
		//문자를 여러개를 못보냄
		BufferedReader br = new BufferedReader(ir);
		//버퍼 : 데이터를 가변적으로 받을 수 있다.
		
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("괜찮아");
			return "";
		}
	}
}
