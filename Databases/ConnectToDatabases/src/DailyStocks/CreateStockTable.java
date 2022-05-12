
package DailyStocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStockTable{

	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL과 JDBC를 연동한다
		    // Connection, Statement, ResultSet 순서
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");                                                                

		      Statement stmt = conn.createStatement(); // JDBC 드라이버 파일 연결

		      stmt.execute("create table stockTable (" 
		            + "date int,"//일자
		            + "short_code  varchar(100), "//단축 코드
		            + "market_cost int,"//시가
		            + "high_cost int,"//고가
		            + "low_cost int,"//저가
		            + "last_cost int,"//종가
		            + "trade_amount long,"//거래량
		            + "trade_money long,"//거래 대금
		            + "PRIMARY KEY (date, short_code))"//기본 키 복합키로 설정
		            + "DEFAULT CHARSET=utf8;" // 언어 지정 > utf8 (한글)
		      );
		      // open한 만큼 close 해 주어야 한다
		      stmt.close();
		      conn.close();
		   }
		}
