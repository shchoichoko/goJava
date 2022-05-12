package PageWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePageWifiTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Wifi Table 만들기
		Class.forName("com.mysql.jdbc.Driver");
		// MY SQL과 JDBC를 연동한다
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		//설치 장소, 주소, 년월, 위도 , 경도 등 알고 싶은 항목으로 테이블 생성.
		//식별을 위해 복합키 설정.
		stmt.execute("create table pageFreeWifi(num int(5) primary key,address varchar(60),latitude double,longitude double);");
		stmt.close();//닫아준다.
		cnn.close();//닫아준다.

	}

}
