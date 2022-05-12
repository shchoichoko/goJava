
package DailyStocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStockTable{

	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL�� JDBC�� �����Ѵ�
		    // Connection, Statement, ResultSet ����
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");                                                                

		      Statement stmt = conn.createStatement(); // JDBC ����̹� ���� ����

		      stmt.execute("create table stockTable (" 
		            + "date int,"//����
		            + "short_code  varchar(100), "//���� �ڵ�
		            + "market_cost int,"//�ð�
		            + "high_cost int,"//��
		            + "low_cost int,"//����
		            + "last_cost int,"//����
		            + "trade_amount long,"//�ŷ���
		            + "trade_money long,"//�ŷ� ���
		            + "PRIMARY KEY (date, short_code))"//�⺻ Ű ����Ű�� ����
		            + "DEFAULT CHARSET=utf8;" // ��� ���� > utf8 (�ѱ�)
		      );
		      // open�� ��ŭ close �� �־�� �Ѵ�
		      stmt.close();
		      conn.close();
		   }
		}
