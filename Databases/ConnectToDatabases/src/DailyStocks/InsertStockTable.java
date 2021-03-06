
package DailyStocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertStockTable {

	   public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		      // TODO Auto-generated method stub
		      Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL과 JDBC를 연동한다
		      // Connection, Statement, ResultSet 순서
		      Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234"); // JDBC 드라이버 파일 로딩                                                                                       

		      String QueryTxt = "insert into stockTable (date, short_code, market_cost, high_cost, low_cost, last_cost, trade_amount, trade_money)"
		            + "values(?,?,?,?,?,?,?,?)";
		      PreparedStatement pstmt = conn.prepareStatement(QueryTxt); // JDBC 드라이버 파일 연결

		      File f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\FileReadTest\\StockDailyPrice.csv");
		      BufferedReader br = new BufferedReader(new FileReader(f));
		      String readtext = " ";
		      readtext = br.readLine();
		      if ((readtext = br.readLine()) == null) {
		         System.out.println("빈 파일 입니다.");
		      }
		      int linecount = 0;
		      conn.setAutoCommit(false);
		      // 시간 형태 만들기
		      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 시간 형태 지정하기
		      long startTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기 (시작 시간)
		      Date startInDate = new Date(startTime); // 형태 날짜로 변환
		      String startFormat = sdf.format(startInDate); // 문자열 변수로 형태 변환

		      while ((readtext = br.readLine()) != null) { //읽을 값이 없을 때까지 반복한다.

		         String[] field = readtext.split(","); //콤마 기준으로 분리하여 field 배열에 저장한다.
		         System.out.println(Arrays.toString(field));
		         pstmt.setInt(1, Integer.parseInt(field[1]));	
		         pstmt.setString(2, field[2]);
		         pstmt.setInt(3, Integer.parseInt(field[4]));
		         pstmt.setInt(4, Integer.parseInt(field[5]));
		         pstmt.setInt(5, Integer.parseInt(field[6]));
		         pstmt.setInt(6, Integer.parseInt(field[3]));
		         pstmt.setLong(7, Long.parseLong(field[11]));
		         pstmt.setLong(8, Long.parseLong(field[12]));
		         pstmt.addBatch();
		         System.out.println(linecount + " 번째 항목 batch 완료");
		         pstmt.clearParameters();
		         linecount++;
		         try {
		            if (linecount % 25000 == 0) {//10000개 만큼 넣을 때마다 commit 하기
		               pstmt.executeBatch();
		               conn.commit();
		               
		            }
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      }
		      try {
		         pstmt.executeBatch();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      conn.commit();
		      conn.setAutoCommit(true);
		      long finishTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		      Date finishInDate = new Date(finishTime); // 형태 날짜로 변환
		      String finishFormat = sdf.format(finishInDate); // 문자열 변수로 형태 변환

		      long diffTime = (finishTime - startTime); // 시간 차이 계산
		      long diffTimeMin = (diffTime / 1000 / 60); // 분 구하기
		      long diffTimeSec = (diffTime / 1000 % 60); // 초 구하기

		      br.close(); //닫아주기
		      pstmt.close(); //닫아주기
		      conn.close(); //닫아주기
		      System.out.println("시작 시간 : " + startFormat); // 시작 시간 출력
		      System.out.println("종료 시간 : " + finishFormat); // 종료 시간 출력
		      System.out.println("소요 시간 : " + diffTimeMin + "분 " + diffTimeSec + "초"); // 소요 시간 출력
		      System.out.println("총 항목 개수 : " + linecount); // 총 항목 개수 출력
		       	
		   }
		}
