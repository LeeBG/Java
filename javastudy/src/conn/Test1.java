package conn;

public class Test1 {

	public static void main(String[] args) {
		String download = "<p class=\"info_temperature\"><span class=\"todaytemp\">10</span>";
		int start = download.indexOf("10");
		System.out.println(start);
		
		
		String data = download.substring(download.indexOf("10"));//10이나올때까지 앞에 싹다날림
		String s[]=data.split("<");
		System.out.println("오늘온도 : "+s[0]);
	}	

}
