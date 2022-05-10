package FreeWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable_Wifi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Wifi Table ¸¸µé±â
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		
		stmt.execute("create table freewifi(inst_place varchar(50),inst_place_detail varchar(50),inst_city varchar(50),"
				+ "inst_country varchar(50), inst_place_flag varchar(50), service_provider varchar(50),"
				+ "wifi_ssid varchar(90), inst_date varchar(50), place_addr_road varchar(50),"
				+ "place_addr_land varchar(50), manage_office varchar(50),manage_office_phone varchar(50), latitude double, longitude double,"
				+ "write_date date, constraint Complex_Primarykey primary key(inst_place,inst_place_detail,inst_city,inst_place_flag,service_provider,wifi_ssid,inst_date,latitude,longitude));");
		stmt.close();
		cnn.close();

	}

}
