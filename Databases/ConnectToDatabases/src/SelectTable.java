import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ���̺� ��ȸ�ϱ�
		Class.forName("com.mysql.jdbc.Driver");//Driver Ŭ���� �ҷ�����.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root"
				,"1234"); //DB������ ���� Connection ��ü ����.
		Statement stmt = conn.createStatement(); //���� ������ ���� Connection ��ü ����.
		ResultSet rs = stmt.executeQuery("select * from examtable;");//������ sql������ ��� ���� �����ϴ� ����.
		System.out.printf("  �̸�   �й�     ����  ����  ����\n");
		while(rs.next()) { //���� ���� ���� ������ �ݺ�.
			System.out.printf("%4s  %6d  %3d  %3d  %3d \n",rs.getString(1),rs.getInt(2),rs.getInt(3),
					rs.getInt(4),rs.getInt(5));
			//getString���δ� ���ڿ��� �޾� ����ϰ�, getInt�δ� �������� �޾Ƽ� ����Ѵ�.
		}
		rs.close();
		conn.close();
		stmt.close();

	}

}
