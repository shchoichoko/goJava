package ParkingLot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchParkingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select문으로 원하는 자료 찾기
		Class.forName("com.mysql.jdbc.Driver");// MY SQL과 JDBC를 연동한다
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		//서버와 kopoctc 데이터베이스 연결
		Statement stmt = cnn.createStatement();
		double lat = 37.3860521;double lng = 127.1214038; //위치 좌표
		String queryTxt;
		//최단 거리 구하는 쿼리문.
		queryTxt = String.format("select * from parkinglot where "+
                "SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
                "(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from parkinglot);",
                lat,lng,lat,lng);

		ResultSet rs = stmt.executeQuery(queryTxt); //쿼리문 실행 후 반환값 받기 위해 생성.
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
