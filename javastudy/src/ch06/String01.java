package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class UserDto{
	private int id;
	private String name;
	
	public String toString() {
		return "User id="+id+", name="+name;
	}
}


public class String01 {

	public static void main(String[] args) {
		String data = "id:1, name:ȫ�浿";
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("ȫ�浿");
		System.out.println(dto);
		String d[];
		String n[];

//		���ϴµ������� ���� ��������  =>  �Ľ��ϱ�
		String s[] =dto.toString().split(", ");
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				d=s[i].split("=");
				for(int j=0;j<d.length;j++) {
					if(j%2==1)
						System.out.println("id:"+d[j]);
				}
			}
			else {
				n=s[i].split("=");
				for(int j=0;j<n.length;j++) {
					if(j%2==1) {
//						n[j]=n[j].replaceAll(")","");
						System.out.println("�̸�:"+n[j]);
					}
						//n[j] ȫ�浿)
	
				}
			}
		}			
	}

}
