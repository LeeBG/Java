import java.sql.Timestamp;
import java.util.Map;
import model.Member;

public class App {

	public static void main(String[] args) {
		// 1.DB���� �� ��������
		Repository r1 = new Repository();
		Map<String, Object> m1 = r1.getRepo();

		// �Ľ��ϱ�(������ ������ �������)
//		Member member = new Member(
//				(Integer)m1.get("id"), // ������ ����ȯ
//				(String)m1.get("username"),
//				(String)m1.get("password"),
//				(String)m1.get("userImg"),
//				(String)m1.get("email"),
//				(Timestamp)m1.get("createDate"),
//				(Timestamp) m1.get("updateDate")
//		);
		
		/* �������� : ����������� �� ������ ����*/
		Member member2 = Member.builder().id(2).username("cos").email("cos@nate.com").build();
		System.out.println(member2);
	}
}
