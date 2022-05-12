package FreeWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable_Wifi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Wifi Table 만들기
		Class.forName("com.mysql.jdbc.Driver");
		// MY SQL과 JDBC를 연동한다
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		//설치 장소, 주소, 년월, 위도 , 경도 등 알고 싶은 항목으로 테이블 생성.
		//식별을 위해 복합키 설정.
		stmt.execute("create table freewifi(inst_place varchar(50),inst_place_detail varchar(50),inst_city varchar(50),"// 
				+ "inst_country varchar(50), inst_place_flag varchar(50), service_provider varchar(50),"
				+ "wifi_ssid varchar(90), inst_date varchar(50), place_addr_road varchar(50),"
				+ "place_addr_land varchar(50), manage_office varchar(50),manage_office_phone varchar(50), latitude double, longitude double,"
				+ "write_date date, constraint Complex_Primarykey primary key(inst_place,inst_place_detail,inst_city,"
				+ "inst_place_flag,service_provider,wifi_ssid,inst_date,latitude,longitude));");
		stmt.close();//닫아준다.
		cnn.close();//닫아준다.

	}

}
