package model;
import java.sql.Timestamp;
import lombok.Data;
@Data
public class Board {
	private long id;
	private long userId;
	private String title;
	private long views;
	private String content;
	private Timestamp createtime;
	private String borderImg;
	
	public Board(User2 user2) {
		userId = user2.getId();
	}
}