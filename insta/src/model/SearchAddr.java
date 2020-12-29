package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchAddr {
	private String roadFullAddr;
	private String roadAddrPart1;
	private String roadAddrPart2;
	private String jibunAddr;
	private String engAddr;
}
