
package ExamTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExamtable2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		
		stmt.execute( "create table examtable3(" +		//examtable3 ���̺� ����
				"studentid int primary key, " + 		//studentid, ����, �ݵ�� ����
				"name varchar(10) , " +	//name, ����(10)
				"kor int , " + 			//kor, ����
				"eng int , " +			//eng, ����
				"mat int)");			//mat ����
		
		// ��� �� ����
		stmt.close();
		conn.close();

	}

}
