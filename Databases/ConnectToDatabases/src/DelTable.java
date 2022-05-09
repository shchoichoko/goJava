import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DelTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//테이블 삭제하기
		Class.forName("com.mysql.jdbc.Driver");//Driver 클래스 불러오기.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");
		//서버 접속을 위해 Connection 객체 생성.
		Statement stmt = conn.createStatement(); //sql구문 실행을 위해 Statement객체 생성.
		stmt.execute("delete from examtable2;"); //테이블의 값만 지우는 sql문을 실행.
		stmt.close();
		conn.close();
		
	}

}
