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
		int num = 0;
		String[] field_name = readtxt.split("\t");//ù��° ���� �ʵ���� �� ������ ���ڿ� �迭�� ������.
		int lineCnt = 0; //���° ������ ǥ���ϱ� ���� ����.
		while((readtxt = br.readLine())!=null) { //���� ���� ���� ������ �ݺ��Ѵ�.
			num += 1;// ���̺� ��ȣ�� �ֱ� ����.
			String[] field = readtxt.split("\t"); //�ʵ� ���� �� ������ ���ڿ� �迭�� �����Ѵ�.
			String queryTxt;//������ ������ ���� ����.
			queryTxt = String.format("insert into pageFreeWifi(num,address,latitude,longitude) values(%d,'%s',%s,%s);",num,field[9],field[12],field[13]); //������ �ʵ� ���� �־��ش�.
			stmt.execute(queryTxt); //������ �����ϴ� ����.
			System.out.printf("%d��° �׸� Insert OK [%s]\n",lineCnt,queryTxt);
			lineCnt++;//���° �׸����� ���� ���� ��.
		}
		
	}

}
