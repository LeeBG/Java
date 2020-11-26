package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn01 {
	public static void main(String[] args) {
		try {
			// 1. �ּҼ��� URL Ŭ���� ���
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");

			// 2. ���ۿ����� ���� ��Ʈ���� ����
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

			// 3. ���ۿ���(8192Byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

			
			
			String input = null;
			String download = "";

			while ((input = br.readLine()) != null) {
				download = download + input;
			}
			
			FileWriter fout = new FileWriter("d:\\file\\test.html");
			fout.write(download, 0, download.length());
			System.out.print(download);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
