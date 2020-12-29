package model;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member extends BaseTime{
	private long id;		//8byte
	private String username;
	private String password;
	private String userImg;
	private String email;
	//create update 는 상속으로 만드는 것이 좋다
	
//	public static Member builder() {
//		return new Member();
//	}
//	
//	public Member id(long id) {
//		this.id =id;
//		return this;
//	}
//	
//	public Member username(String username) {
//		this.username =username;
//		return this;
//	}
//	
//	public Member password(String password) {
//		this.password =password;
//		return this;
//	}
//	public Member userImg(String userImg) {
//		this.userImg =userImg;
//		return this;
//	}
//	public Member email(String email) {
//		this.email =email;
//		return this;
//	}
//	public Member createDate(Timestamp createDate) {
//		this.createDate =createDate;
//		return this;
//	}
//	public Member updateDate(Timestamp updateDate) {
//		this.updateDate =updateDate;
//		return this;
//	}
}
