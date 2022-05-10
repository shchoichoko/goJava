package FreeWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Table 완전히 삭제하기
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = cnn.createStatement();
		stmt.execute("drop table freewifi;");
		stmt.close();
		cnn.close();
	}

}
