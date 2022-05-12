package ParkingLot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 테이블 생성 혹은 삭제 
		Class.forName("com.mysql.jdbc.Driver");		// MY SQL과 JDBC를 연동한다
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		//서버 및 데이터베이스 연결하기
		Statement stmt = cnn.createStatement();
		
		stmt.execute(order(1));//테이블 생성 하거나 삭제하는 함수
		stmt.close();
		cnn.close();
	}
	public static String order(int order) {
		String value = " ";
		if(order==1) {//테이블 생성하기. 주차장 코드를 PK로 지정.
			value = "create table parkinglot(parkingCode int(30) primary key,parkinglotName varchar(100), parkingAddress varchar(100),"
					+ "parkingTypeName varchar(40), systemType varchar(40),phoneNum varchar(50),totalSpace int(20),"
					+ "FreeOrChargedName varchar(20),"
					+ "latitude double,longitude double);";
		} else {
			value = "drop table parkinglot;";//테이블 삭제하기
		}
		return value; 
	}

}
