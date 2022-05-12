
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
		      Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL�� JDBC�� �����Ѵ�
		      // Connection, Statement, ResultSet ����
		      Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234"); // JDBC ����̹� ���� �ε�                                                                                       

		      String QueryTxt = "insert into stockTable (date, short_code, market_cost, high_cost, low_cost, last_cost, trade_amount, trade_money)"
		            + "values(?,?,?,?,?,?,?,?)";
		      PreparedStatement pstmt = conn.prepareStatement(QueryTxt); // JDBC ����̹� ���� ����

		      File f = new File("C:\\Users\\������\\Desktop\\SooHyeok\\FileReadTest\\StockDailyPrice.csv");
		      BufferedReader br = new BufferedReader(new FileReader(f));
		      String readtext = " ";
		      readtext = br.readLine();
		      if ((readtext = br.readLine()) == null) {
		         System.out.println("�� ���� �Դϴ�.");
		      }
		      int linecount = 0;
		      conn.setAutoCommit(false);
		      // �ð� ���� �����
		      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �ð� ���� �����ϱ�
		      long startTime = System.currentTimeMillis(); // �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
		      Date startInDate = new Date(startTime); // ���� ��¥�� ��ȯ
		      String startFormat = sdf.format(startInDate); // ���ڿ� ������ ���� ��ȯ

		      while ((readtext = br.readLine()) != null) { //���� ���� ���� ������ �ݺ��Ѵ�.

		         String[] field = readtext.split(","); //�޸� �������� �и��Ͽ� field �迭�� �����Ѵ�.
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
		         System.out.println(linecount + " ��° �׸� batch �Ϸ�");
		         pstmt.clearParameters();
		         linecount++;
		         try {
		            if (linecount % 25000 == 0) {//10000�� ��ŭ ���� ������ commit �ϱ�
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
		      long finishTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		      Date finishInDate = new Date(finishTime); // ���� ��¥�� ��ȯ
		      String finishFormat = sdf.format(finishInDate); // ���ڿ� ������ ���� ��ȯ

		      long diffTime = (finishTime - startTime); // �ð� ���� ���
		      long diffTimeMin = (diffTime / 1000 / 60); // �� ���ϱ�
		      long diffTimeSec = (diffTime / 1000 % 60); // �� ���ϱ�

		      br.close(); //�ݾ��ֱ�
		      pstmt.close(); //�ݾ��ֱ�
		      conn.close(); //�ݾ��ֱ�
		      System.out.println("���� �ð� : " + startFormat); // ���� �ð� ���
		      System.out.println("���� �ð� : " + finishFormat); // ���� �ð� ���
		      System.out.println("�ҿ� �ð� : " + diffTimeMin + "�� " + diffTimeSec + "��"); // �ҿ� �ð� ���
		      System.out.println("�� �׸� ���� : " + linecount); // �� �׸� ���� ���
		       	
		   }
		}
