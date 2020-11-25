package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{	//������� ������ trans object
	private int statusCode;	//200[����] ������, 300[�ٽÿ�û] ��ٷ��� , 400[�߸��� ��û] �߸���.
//	private Object data;
	//ObjectŸ���� �� �� �� ������ ����ϱ� ��ƴ�
	private T data;		//T�� ���� �������� ���� Ÿ�Ԥ�
}
class Dog{
	String name = "�ȳ�";
}
// ������ Ÿ���� ������ / ������ Ÿ���� �𸣴� ��Ȳ >> generic <>
public class Generic01 {

	public static void main(String[] args) {
		ResponseDto <Integer> dto= new ResponseDto();		//<�ȿ� wrapper Ŭ����>
		dto.setStatusCode(200);	//200�޾Ҵ� ����
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		
		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}
