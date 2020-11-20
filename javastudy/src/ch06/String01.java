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
		String data = "id:1, name:홍길동";
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("홍길동");
		System.out.println(dto);
		String d[];
		String n[];

//		원하는데이터의 값만 가져오기  =>  파싱하기
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
						System.out.println("이름:"+n[j]);
					}
						//n[j] 홍길동)
	
				}
			}
		}			
	}

}
