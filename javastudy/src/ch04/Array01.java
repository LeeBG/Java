package ch04;

class User{
	private int id;
	private String name;
	private String phone;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
public class Array01 {
	
	public static void main(String[] args) {
		User[] users = new User[3];			//user Type에 3개
		
		users[0] = new User(1, "홍길동", "01022223333");
		users[1] = new User(2, "임꺽정", "01055553333");
		users[2] = new User(3, "장보고", "01077773333");
		
		
		System.out.println("아이디"+users[2].getId());
		System.out.println("이름"+users[2].getName());
		System.out.println("전화번호"+users[2].getPhone());
	}
}	
