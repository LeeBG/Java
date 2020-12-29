package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Favorite extends BaseTime {
	private long id;
	private long userId;
	private long imageId;
}
