package PageWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePageWifiTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Wifi Table �����
		Class.forName("com.mysql.jdbc.Driver");
		// MY SQL�� JDBC�� �����Ѵ�
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		//��ġ ���, �ּ�, ���, ���� , �浵 �� �˰� ���� �׸����� ���̺� ����.
		//�ĺ��� ���� ����Ű ����.
		stmt.execute("create table pageFreeWifi(num int(5) primary key,address varchar(60),latitude double,longitude double);");
		stmt.close();//�ݾ��ش�.
		cnn.close();//�ݾ��ش�.

	}

}
