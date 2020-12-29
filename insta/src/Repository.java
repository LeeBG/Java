import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
@Data
public class Repository {
	private Map<String, Object> repo;
	
	public Repository() {
		repo = new HashMap<>();
		repo.put("id", 1);
		repo.put("username","ssar");
		repo.put("password", 1234);
		repo.put("email", "ssar@nate.com");
		repo.put("createDate", Timestamp.valueOf(LocalDateTime.now()));
		repo.put("updateDate", Timestamp.valueOf(LocalDateTime.now()));//1.8ºÎÅÍ³ª¿ÈLocalDateTime
	}
}
