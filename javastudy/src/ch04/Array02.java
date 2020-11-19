package ch04;

interface Job{
	public String getName();
}
class Police implements Job{
	private String name = "����";
	
	public String getName() {
		return name;
	}
}
class Doctor  implements Job{
	private String name = "�ǻ�";
	public String getName() {
		return name;
	}
}
public class Array02 {
	public static void main(String[] args) {
		Job[] p = new Job[2];
		
		p[0] = new Police();
		p[1] = new Doctor();
		
		for(int i=0;i<p.length;i++) {
			System.out.println("������ :"+p[i].getName());
		}
	}
}
