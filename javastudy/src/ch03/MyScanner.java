package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {

	public String getData() {
		InputStream in = System.in;
		//���ڸ� ���ڷ� ����
		InputStreamReader ir = new InputStreamReader(in);
		//���ڸ� �������� ������
		BufferedReader br = new BufferedReader(ir);
		//���� : �����͸� ���������� ���� �� �ִ�.
		
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������");
			return "";
		}
	}
}