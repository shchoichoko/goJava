package ParkingLot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchParkingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select������ ���ϴ� �ڷ� ã��
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = cnn.createStatement();
		double lat = 37.3860521;double lng = 127.1214038;
		String queryTxt;
		queryTxt = String.format("select * from parkinglot where "+
                "SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
                "(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from parkinglot);",
                lat,lng,lat,lng);
		//queryTxt = "select * from parkinglot";
		//queryTxt = "select * from parkinglot where service_provider = 'SKT'";
		//queryTxt = "select * from parkinglot where inst_country = '������'";
		
		ResultSet rs = stmt.executeQuery(queryTxt);
		int iCnt = 0;
		while(rs.next()) {
			System.out.printf("*(%d)*******************************\n",iCnt++);
			System.out.printf("�������ڵ�       : %s\n",rs.getString(1));
			System.out.printf("�������         : %s\n",rs.getString(2));
			System.out.printf("�ּ�             : %s\n",rs.getString(3));
			System.out.printf("������ ����      : %s\n",rs.getString(4));
			System.out.printf("����и�       : %s\n",rs.getString(5));
			System.out.printf("��ȭ��ȣ         : %s\n",rs.getString(6));
			System.out.printf("�� ������        : %s\n",rs.getString(7));
			System.out.printf("�����ᱸ��       : %s\n",rs.getString(8));
			System.out.printf("������ ��ǥ ���� : %s\n",rs.getString(9));
			System.out.printf("������ ��ǥ �浵 : %s\n",rs.getString(10));
			System.out.printf("**********************************\n");
		}
		rs.close();
		stmt.close();
		cnn.close();
	}

}
