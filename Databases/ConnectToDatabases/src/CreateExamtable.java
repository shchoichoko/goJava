import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExamtable {
	//���̺� �����ϱ�. 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");	//Driver Ŭ���� �ҷ�����.
		//DB������ ���� Connection ��ü ����.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = conn.createStatement(); //sql���� ������ ���� statement ��ü ����.
		stmt.execute("create table examtable2(name varchar(20),studentid int not null primary key,"
				+ "kor int, eng int, mat int);");
		//��� ���� ��ȯ ���� �ʿ䰡 ���� ������ ResultSet�� �ۼ����� ����.
		stmt.close();
		conn.close();
	}

}
