package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	
	private int id;				//번호
	private String text;		//내용
	private String to;			//수신자
	private int errorCode;		//에러코드 4자
	private String sendTime;	//보낸 시간
}
