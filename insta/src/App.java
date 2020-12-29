import java.sql.Timestamp;
import java.util.Map;
import model.Member;

public class App {

	public static void main(String[] args) {
		// 1.DB에서 값 가져오기
		Repository r1 = new Repository();
		Map<String, Object> m1 = r1.getRepo();

		// 파싱하기(순서와 갯수를 맞춰야함)
//		Member member = new Member(
//				(Integer)m1.get("id"), // 묵시적 형변환
//				(String)m1.get("username"),
//				(String)m1.get("password"),
//				(String)m1.get("userImg"),
//				(String)m1.get("email"),
//				(Timestamp)m1.get("createDate"),
//				(Timestamp) m1.get("updateDate")
//		);
		
		/* 빌더패턴 : 순서상관없이 막 넣을수 있음*/
		Member member2 = Member.builder().id(2).username("cos").email("cos@nate.com").build();
		System.out.println(member2);
	}
}
