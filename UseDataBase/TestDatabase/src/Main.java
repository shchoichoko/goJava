import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		Statement statement = null;
		ResultSet resultSet = null;
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/class";
		String id = "root";
		String password = "1234";
		String dbQuery = "select * from student";
		try {
			connection = DriverManager.getConnection(url, id, password);
			statement = connection.createStatement();
			statement.execute(dbQuery);
			if (statement.execute(dbQuery)) {
				resultSet = statement.getResultSet();
			}
			while (resultSet.next()) {
				String str = resultSet.getString(1);
				String str2 = resultSet.getString(2);
				System.out.println(str + " " + str2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
