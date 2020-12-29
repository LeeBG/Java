package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Follow extends BaseTime{

	private long id;
	private long fromUserId;	//fk
	private long toUserId;		//fk
}
