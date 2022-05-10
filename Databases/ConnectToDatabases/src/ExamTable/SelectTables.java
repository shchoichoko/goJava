package ExamTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTables {
	public static void headerPrint(int pageNum) {
		
		System.out.println("                              성적집계표");
		System.out.println("");
		System.out.printf("PAGE : %d\n",pageNum);
		System.out.printf("========================================================================\n");
		System.out.printf("  번호    학번        이름      국어   영어    수학  개인합계  개인평균\n");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root", "1234");
		Statement stmt = cnn.createStatement();
		int totalPeople = 1000;
		int pageNum = 0;
		int pagePeople = 30;
		int lastPeople = 0;
		pageNum = totalPeople/pagePeople;
		String queryTxt = " ";String queryTxt2 = " ";
		if(totalPeople%pagePeople!=0&&totalPeople>pagePeople) {
			lastPeople = totalPeople-(pageNum*pagePeople);
		}

		for(int page = 0; page < pageNum; page++) {//페이지별 성적 및 평균
			headerPrint(page);
			queryTxt = String.format("select *,kor+eng+math as sum,(kor+eng+math)/3 as avg from examtable limit %d,%d;",page*pagePeople,pagePeople);
			ResultSet rs = stmt.executeQuery(queryTxt);
			int iCnt = page*pagePeople+1;

			while (rs.next()) {
				System.out.printf(" %4d  %10s  %10s  %4s   %4s    %4s    %4s     %6.2f\n", iCnt,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7));
				iCnt++;
			}
			
			queryTxt2 = String.format("select sum(kor) over(order by studentid) as KorSum,sum(eng) over(order by studentid) as engSum,sum(math) over(order by studentid) as mathSum,sum(kor+eng+math) over(order by studentid) as pageSum from examtable limit %d,%d;",page*pagePeople,pagePeople);
			ResultSet rs2 = stmt.executeQuery(queryTxt2);
			//현재 페이지 부분
			System.out.printf("========================================================================\n");
			System.out.printf("현재페이지\n");
			int count = 0;
			int sum = 0;
	//		System.out.printf(" 합계 :                         %4d   %4d   %4d     %4d\n",rs2.getInt(1),rs2.getInt(2),rs2.getInt(3),rs2.getInt(4));
	//		System.out.printf(" 합계 :                         %4d   %4d   %4d     %4d      %4d\n",rs2.getInt(1),rs2.getInt(2),rs2.getInt(3),rs2.getInt(4));
	//		System.out.printf(" 평균 :                         %4d   %4d   %4d     %4d      %4d\n");
			
			System.out.printf("========================================================================\n");
			System.out.printf("누적페이지\n");
			while(rs2.next()) {
				count++;
				if(count==pagePeople) {
					System.out.printf(" 합계 :                         %4d   %4d   %4d     %4d    %4d\n",rs2.getInt(1),rs2.getInt(2),rs2.getInt(3),rs2.getInt(4),rs2.getInt(4)/iCnt);
				}
			}
			System.out.println(" ");
			rs.close();
		}
		if(lastPeople != 0) {
			queryTxt2 = String.format("select *,kor+eng+math as sum,(kor+eng+math)/3 as avg from examtable limit %d,%d;",(pageNum*pagePeople),totalPeople);
			ResultSet rs2 = stmt.executeQuery(queryTxt2);
			headerPrint(pageNum+1);
			int iCnt = (pageNum*pagePeople)+1;
			while (rs2.next()) {
				System.out.printf(" %4d  %10s  %10s  %4s   %4s    %4s    %4s     %6.2f\n", iCnt,rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6),rs2.getDouble(7));
				iCnt++;
				
			}
		}
		stmt.close();
		cnn.close();

	}


}
