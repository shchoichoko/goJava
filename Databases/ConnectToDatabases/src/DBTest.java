import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 현재 데이터베이스 목록 보기.
		Class.forName("com.mysql.jdbc.Driver"); //Driver클래스를 불러온다.
		//DB 연결을 위해 Connection 객체 생성.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");
		//kopoctc는 데이터베이스의 이름이다.
		//root는 id, 1234는 패스워드 이다.
		Statement stmt = conn.createStatement();//SQL구문을 실행하는 역할.
		ResultSet rset = stmt.executeQuery("show databases;"); //실행한 sql구문의 결과 값을 저장하는 역할.
		
		while(rset.next()) {//읽을 값이 있을 때까지 반복
			System.out.println("값 : " + rset.getString(1));//얻은 결과값을 출력한다.
		}
		rset.close();
		stmt.close();
		conn.close();
		
	}

}
