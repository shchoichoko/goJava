package ExamTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExamtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 테이블 생성 혹은 삭제
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = cnn.createStatement();
		stmt.execute(order(1));
		stmt.close();
		cnn.close();
	}

	public static String order(int order) {
		String value = " ";
		if (order == 1) {
			value = "create table examtable(studentid varchar(20) primary key,name varchar(15), kor int(3), eng int(3), math int(3));";
			//value = "insert into examtable(studentid, name, kor, eng, math) values('kopo1000','Steve1000',65,72,80);";
		} else {
			value = "drop table examtable;";
		}
		return value;
	}

}
