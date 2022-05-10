package ParkingLot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchParkingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select문으로 원하는 자료 찾기
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = cnn.createStatement();
		double lat = 37.3860521;double lng = 127.1214038;
		String queryTxt;
		queryTxt = String.format("select * from parkinglot where "+
                "SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
                "(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from parkinglot);",
                lat,lng,lat,lng);
		//queryTxt = "select * from parkinglot";
		//queryTxt = "select * from parkinglot where service_provider = 'SKT'";
		//queryTxt = "select * from parkinglot where inst_country = '수원시'";
		
		ResultSet rs = stmt.executeQuery(queryTxt);
		int iCnt = 0;
		while(rs.next()) {
			System.out.printf("*(%d)*******************************\n",iCnt++);
			System.out.printf("주차장코드       : %s\n",rs.getString(1));
			System.out.printf("주차장명         : %s\n",rs.getString(2));
			System.out.printf("주소             : %s\n",rs.getString(3));
			System.out.printf("주차장 종류      : %s\n",rs.getString(4));
			System.out.printf("운영구분명       : %s\n",rs.getString(5));
			System.out.printf("전화번호         : %s\n",rs.getString(6));
			System.out.printf("총 주차면        : %s\n",rs.getString(7));
			System.out.printf("유무료구분       : %s\n",rs.getString(8));
			System.out.printf("주차장 좌표 위도 : %s\n",rs.getString(9));
			System.out.printf("주차장 좌표 경도 : %s\n",rs.getString(10));
			System.out.printf("**********************************\n");
		}
		rs.close();
		stmt.close();
		cnn.close();
	}

}
