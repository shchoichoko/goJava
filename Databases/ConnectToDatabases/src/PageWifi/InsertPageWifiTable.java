package PageWifi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPageWifiTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// 테이블에 데이터 삽입하기.
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		File f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\교안\\데이터베이스프로그래밍(v2022)\\전국무료와이파이표준데이터.txt");
		BufferedReader br = new BufferedReader(new FileReader(f)); //파일을 읽을 객체 생성.
		String readtxt; //한줄 한줄 읽어줄 때 사용할 문자열
		if((readtxt = br.readLine())==null) { //읽을 값이 없을 때 수행함.
			System.out.println("빈 파일입니다.\n");
			return;
		}
		int num = 0;
		String[] field_name = readtxt.split("\t");//첫번째 줄인 필드명을 탭 단위로 문자열 배열에 저장함.
		int lineCnt = 0; //몇번째 줄인지 표기하기 위한 변수.
		while((readtxt = br.readLine())!=null) { //읽을 값이 있을 때까지 반복한다.
			num += 1;// 테이블에 번호를 넣기 위함.
			String[] field = readtxt.split("\t"); //필드 값을 탭 단위로 문자열 배열에 저장한다.
			String queryTxt;//쿼리문 저장을 위한 변수.
			queryTxt = String.format("insert into pageFreeWifi(num,address,latitude,longitude) values(%d,'%s',%s,%s);",num,field[9],field[12],field[13]); //각각의 필드 값을 넣어준다.
			stmt.execute(queryTxt); //쿼리문 실행하는 문장.
			System.out.printf("%d번째 항목 Insert OK [%s]\n",lineCnt,queryTxt);
			lineCnt++;//몇번째 항목인지 세기 위한 식.
		}
		
	}

}
