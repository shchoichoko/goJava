import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ���� �����ͺ��̽� ��� ����.
		Class.forName("com.mysql.jdbc.Driver"); //DriverŬ������ �ҷ��´�.
		//DB ������ ���� Connection ��ü ����.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");
		//kopoctc�� �����ͺ��̽��� �̸��̴�.
		//root�� id, 1234�� �н����� �̴�.
		Statement stmt = conn.createStatement();//SQL������ �����ϴ� ����.
		ResultSet rset = stmt.executeQuery("show databases;"); //������ sql������ ��� ���� �����ϴ� ����.
		
		while(rset.next()) {//���� ���� ���� ������ �ݺ�
			System.out.println("�� : " + rset.getString(1));//���� ������� ����Ѵ�.
		}
		rset.close();
		stmt.close();
		conn.close();
		
	}

}
