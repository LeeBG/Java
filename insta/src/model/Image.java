package model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Image extends BaseTime {

	private long id;
	private String imgUrl;
	private long userId;
	private String content;

}
