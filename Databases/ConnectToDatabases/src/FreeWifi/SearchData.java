package FreeWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select문으로 원하는 자료 찾기
		Class.forName("com.mysql.jdbc.Driver");// MY SQL과 JDBC를 연동한다
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		//서버와 kopoctc 데이터베이스 연결
		Statement stmt = cnn.createStatement();
		double lat = 37.3860521;double lng = 127.1214038;
		//거리 측정을 위한 위도 경도 좌표 설정.
		String queryTxt;
		queryTxt = String.format("select * from freewifi where "+//가장 가까운 거리의 무료 와이파이 지점 구하는 쿼리문
                "SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
                "(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from freewifi);",
                lat,lng,lat,lng);
		queryTxt = "select * from freewifi"; //전체 조회하는 쿼리문
		queryTxt = "select * from freewifi where service_provider = 'SKT'";//통신사가 SKT인 것만 조회하는 쿼리문
		queryTxt = "select * from freewifi where inst_country = '수원시'";
		
		ResultSet rs = stmt.executeQuery(queryTxt);
		int iCnt = 0;
		while(rs.next()) {
			System.out.printf("*(%d)*******************************\n",iCnt++);
			System.out.printf("설치장소명       : %s\n",rs.getString(1));
			System.out.printf("설치장소상세     : %s\n",rs.getString(2));
			System.out.printf("설치시도명       : %s\n",rs.getString(3));
			System.out.printf("설치시군구명     : %s\n",rs.getString(4));
			System.out.printf("설치시설구분     : %s\n",rs.getString(5));
			System.out.printf("서비스제공사명   : %s\n",rs.getString(6));
			System.out.printf("와이파이SSID     : %s\n",rs.getString(7));
			System.out.printf("설치년월         : %s\n",rs.getString(8));
			System.out.printf("소재지도로명주소 : %s\n",rs.getString(9));
			System.out.printf("소재지지번주소   : %s\n",rs.getString(10));
			System.out.printf("관리기관명       : %s\n",rs.getString(11));
			System.out.printf("관리기관전화번호 : %s\n",rs.getString(12));
			System.out.printf("위도             : %s\n",rs.getString(13));
			System.out.printf("경도             : %s\n",rs.getString(14));
			System.out.printf("데이터기준일자   : %s\n",rs.getString(15));
			System.out.printf("**********************************\n");
		}
		rs.close();
		stmt.close();
		cnn.close();
	}

}
