package FreeWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select������ ���ϴ� �ڷ� ã��
		Class.forName("com.mysql.jdbc.Driver");// MY SQL�� JDBC�� �����Ѵ�
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		//������ kopoctc �����ͺ��̽� ����
		Statement stmt = cnn.createStatement();
		double lat = 37.3860521;double lng = 127.1214038;
		//�Ÿ� ������ ���� ���� �浵 ��ǥ ����.
		String queryTxt;
		queryTxt = String.format("select * from freewifi where "+//���� ����� �Ÿ��� ���� �������� ���� ���ϴ� ������
                "SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
                "(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from freewifi);",
                lat,lng,lat,lng);
		queryTxt = "select * from freewifi"; //��ü ��ȸ�ϴ� ������
		queryTxt = "select * from freewifi where service_provider = 'SKT'";//��Ż簡 SKT�� �͸� ��ȸ�ϴ� ������
		queryTxt = "select * from freewifi where inst_country = '������'";
		
		ResultSet rs = stmt.executeQuery(queryTxt);
		int iCnt = 0;
		while(rs.next()) {
			System.out.printf("*(%d)*******************************\n",iCnt++);
			System.out.printf("��ġ��Ҹ�       : %s\n",rs.getString(1));
			System.out.printf("��ġ��һ�     : %s\n",rs.getString(2));
			System.out.printf("��ġ�õ���       : %s\n",rs.getString(3));
			System.out.printf("��ġ�ñ�����     : %s\n",rs.getString(4));
			System.out.printf("��ġ�ü�����     : %s\n",rs.getString(5));
			System.out.printf("�����������   : %s\n",rs.getString(6));
			System.out.printf("��������SSID     : %s\n",rs.getString(7));
			System.out.printf("��ġ���         : %s\n",rs.getString(8));
			System.out.printf("���������θ��ּ� : %s\n",rs.getString(9));
			System.out.printf("�����������ּ�   : %s\n",rs.getString(10));
			System.out.printf("���������       : %s\n",rs.getString(11));
			System.out.printf("���������ȭ��ȣ : %s\n",rs.getString(12));
			System.out.printf("����             : %s\n",rs.getString(13));
			System.out.printf("�浵             : %s\n",rs.getString(14));
			System.out.printf("�����ͱ�������   : %s\n",rs.getString(15));
			System.out.printf("**********************************\n");
		}
		rs.close();
		stmt.close();
		cnn.close();
	}

}
