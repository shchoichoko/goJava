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
		// ���̺� ������ �����ϱ�.
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root","1234");
		Statement stmt = cnn.createStatement();
		File f = new File("C:\\Users\\������\\Desktop\\SooHyeok\\����\\�����ͺ��̽����α׷���(v2022)\\���������������ǥ�ص�����.txt");
		BufferedReader br = new BufferedReader(new FileReader(f)); //������ ���� ��ü ����.
		String readtxt; //���� ���� �о��� �� ����� ���ڿ�
		if((readtxt = br.readLine())==null) { //���� ���� ���� �� ������.
			System.out.println("�� �����Դϴ�.\n");
			return;
		}
		String[] field_name = readtxt.split("\t");//ù��° ���� �ʵ���� �� ������ ���ڿ� �迭�� ������.
		int lineCnt = 0; //���° ������ ǥ���ϱ� ���� ����.
		while((readtxt = br.readLine())!=null) { //���� ���� ���� ������ �ݺ��Ѵ�.
			String[] field = readtxt.split("\t"); //�ʵ� ���� �� ������ ���ڿ� �迭�� �����Ѵ�.
			String queryTxt;//������ ������ ���� ����.
			queryTxt = String.format("insert into freewifi(inst_place,inst_place_detail,inst_city,inst_country,inst_place_flag,"
					+ "service_provider,wifi_ssid,inst_date,place_addr_road,place_addr_land,manage_office,manage_office_phone,latitude,longitude,write_date)"
					+ " values('%s','%s','%s','%s','%s',"
					+ "'%s','%s','%s','%s','%s',"
					+ "'%s','%s',%s,%s,'%s');",field[0],field[1],field[2],field[3],field[4],
					field[5],field[6],field[7],field[8],field[9],
					field[10],field[11],field[12],field[13],field[14]); //������ �ʵ� ���� �־��ش�.
			stmt.execute(queryTxt); //������ �����ϴ� ����.
			System.out.printf("%d��° �׸� Insert OK [%s]\n",lineCnt,queryTxt);
			lineCnt++;//���° �׸����� ���� ���� ��.
		}
		
	}

}
