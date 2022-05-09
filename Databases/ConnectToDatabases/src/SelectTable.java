import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 테이블 조회하기
		Class.forName("com.mysql.jdbc.Driver");//Driver 클래스 불러오기.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root"
				,"1234"); //DB연결을 위해 Connection 객체 생성.
		Statement stmt = conn.createStatement(); //서버 접속을 위해 Connection 객체 생성.
		ResultSet rs = stmt.executeQuery("select * from examtable;");//실행한 sql구문의 결과 값을 저장하는 역할.
		System.out.printf("  이름   학번     국어  영어  수학\n");
		while(rs.next()) { //읽을 값이 없을 때까지 반복.
			System.out.printf("%4s  %6d  %3d  %3d  %3d \n",rs.getString(1),rs.getInt(2),rs.getInt(3),
					rs.getInt(4),rs.getInt(5));
			//getString으로는 문자열을 받아 출력하고, getInt로는 정수형을 받아서 출력한다.
		}
		rs.close();
		conn.close();
		stmt.close();

	}

}
