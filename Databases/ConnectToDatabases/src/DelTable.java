import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DelTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//���̺� �����ϱ�
		Class.forName("com.mysql.jdbc.Driver");//Driver Ŭ���� �ҷ�����.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");
		//���� ������ ���� Connection ��ü ����.
		Statement stmt = conn.createStatement(); //sql���� ������ ���� Statement��ü ����.
		stmt.execute("delete from examtable2;"); //���̺��� ���� ����� sql���� ����.
		stmt.close();
		conn.close();
		
	}

}
