import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExamtable {
	//테이블 생성하기. 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");	//Driver 클래스 불러오기.
		//DB연결을 위해 Connection 객체 생성.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = conn.createStatement(); //sql구문 실행을 위해 statement 객체 생성.
		stmt.execute("create table examtable2(name varchar(20),studentid int not null primary key,"
				+ "kor int, eng int, mat int);");
		//결과 값을 반환 받을 필요가 없기 때문에 ResultSet을 작성하지 않음.
		stmt.close();
		conn.close();
	}

}
