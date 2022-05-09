import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//테이블에 데이터 삽입.
		Class.forName("com.mysql.jdbc.Driver");//Driver 클래스 불러오기.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");//DB연결을 위해 Connection 객체 생성.
		Statement stmt = conn.createStatement();//서버 접속을 위해 Connection 객체 생성.
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('나연',209901,95,100,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('정연',209902,95,95,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('모모',209903,100,100,100);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('사나',209904,100,95,90);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('지효',209905,80,100,70);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('미나',209906,95,90,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('다현',209907,100,90,100);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('채영',209908,100,75,90);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('쯔위',209909,100,100,70);");
		//값을 삽입해준다.
		stmt.close();
		conn.close();
		
	}

}
