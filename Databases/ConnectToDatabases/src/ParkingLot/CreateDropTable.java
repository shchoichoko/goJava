package ParkingLot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 테이블 생성 혹은 삭제 
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		
		stmt.execute(order(1));
		stmt.close();
		cnn.close();
	}
	public static String order(int order) {
		String value = " ";
		if(order==1) {
			value = "create table parkinglot(parkingCode int(30) primary key,parkinglotName varchar(100), parkingAddress varchar(100),"
					+ "parkingTypeName varchar(40), systemType varchar(40),phoneNum varchar(50),totalSpace int(20),"
					+ "FreeOrChargedName varchar(20),"
					+ "latitude double,longitude double);";
		} else {
			value = "drop table parkinglot;";
		}
		return value; 
	}

}
