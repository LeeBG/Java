package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class BaseTime {
	private Timestamp createDate;
	private Timestamp updateDate;
	
	public BaseTime() {
		createDate = Timestamp.valueOf(LocalDateTime.now());
		updateDate = Timestamp.valueOf(LocalDateTime.now());
	}
}
