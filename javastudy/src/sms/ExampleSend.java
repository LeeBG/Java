package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */
public class ExampleSend {
	public static void SendM(String to, String text) {
		String api_key = "NCSQLLSDEIEDE6PW";
	    String api_secret = "HMUEOCENBSZFANVWZSABQDCUY4IMCW9P";
	    Message coolsms = new Message(api_key, api_secret);
	    
	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", to);
	    params.put("from", "0108539184");
	    params.put("type", "SMS");
	    params.put("text", text);
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {	//����ϴٺ��� �������� ���� �������� ��Ȳ�� ���� �� ����.
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println("�޽����� ���۵Ǿ����ϴ�.");
	      //1�� obj��(���ڿ�) -> �ڹ� ������Ʈ
	      //2�� error�� �ִ��� Ȯ��
	      //3�� DB insert
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	}
	public static void main(String[] args) {
		SendM("01085391848","�ݰ�����");
	}
}