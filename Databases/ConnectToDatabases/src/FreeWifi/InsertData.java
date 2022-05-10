package FreeWifi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

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
		String[] field_name = readtxt.split("\t");//첫번째 줄인 필드명을 탭 단위로 문자열 배열에 저장함.
		int lineCnt = 0; //몇번째 줄인지 표기하기 위한 변수.
		while((readtxt = br.readLine())!=null) { //읽을 값이 있을 때까지 반복한다.
			String[] field = readtxt.split("\t"); //필드 값을 탭 단위로 문자열 배열에 저장한다.
			String queryTxt;//쿼리문 저장을 위한 변수.
			queryTxt = String.format("insert into freewifi(inst_place,inst_place_detail,inst_city,inst_country,inst_place_flag,"
					+ "service_provider,wifi_ssid,inst_date,place_addr_road,place_addr_land,manage_office,manage_office_phone,latitude,longitude,write_date)"
					+ " values('%s','%s','%s','%s','%s',"
					+ "'%s','%s','%s','%s','%s',"
					+ "'%s','%s',%s,%s,'%s');",field[0],field[1],field[2],field[3],field[4],
					field[5],field[6],field[7],field[8],field[9],
					field[10],field[11],field[12],field[13],field[14]); //각각의 필드 값을 넣어준다.
			stmt.execute(queryTxt); //쿼리문 실행하는 문장.
			System.out.printf("%d번째 항목 Insert OK [%s]\n",lineCnt,queryTxt);
			lineCnt++;//몇번째 항목인지 세기 위한 식.
		}
		
	}

}
