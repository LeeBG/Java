package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;
	
	public String toString() {
		return "{\"group_id\":\""+group_id+"\",\"error_list\":{\"1\":\""+error_list+"\"},\"success_count\":"+success_count+",\"error_count\":"+error_count+"}";
	}
	public static void main(String[] args) 
	{
		
		String data = "{\"group_id\":\"R2GROViweubbRRfd\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		Response res = new Response();
		//{"group_id":"R2GOzpzWEvj80wdS","error_list":{"1":"1062"},"success_count":0,"error_count":1}
		System.out.println(data.indexOf("{"));
		System.out.println(data.lastIndexOf("}"));
		
		res.group_id="R2GROViweubbRRfd";
		res.error_list="1062";
		res.success_count="0";
		res.error_count="1";
		
		System.out.println(res);
		System.out.println(data);
		
		String start = res.toString().substring(1,res.toString().lastIndexOf("}"));//끝자리 제거
		
		String r[] = start.split(",");
		String r1[] = r[0].split(":");								//r1 그룹아이디 : 아이디
		String r2[]= r[1].split(",");								//r2 에러리스트 : {에러리스트}
		String r3[] = r[2].split(",");
		String r4[] = r[3].split(",");
		
		String g_id = r1[1];										//아이디 파싱
		g_id = g_id.substring(1,g_id.lastIndexOf("\""));			//아이디
			
		String r2_sub[] = r2[0].split(":");
		String r3_sub[] = r3[0].split(":");
		String r4_sub[] = r4[0].split(":");
		
		String errornum= r2_sub[2];
		String err_list=errornum.substring(1,errornum.lastIndexOf("\"}"));//error_list
		String suc_count = r3_sub[1];						//성공 카운트
		String err_count = r4_sub[1];						//실패 카운트
			
		
		System.out.println(g_id + " "+ err_list+" "+suc_count+" "+err_count);
		
	}
}
