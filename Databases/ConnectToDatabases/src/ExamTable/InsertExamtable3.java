
package ExamTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExamtable3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// 1000�� ������ �Է�
		int num = 1000;
		// 1000���� �����͸� �Է��ϱ� ���� for ���ۼ�
		for(int i = 1; i <= num; i++) {
			String name = String.format("ȫ��%03d", i);	//�̸� ����
			String QueryTxt;	//��ɾ �����ϱ� ���� ���ڿ� ����
			//ROUND(RAND()*100, 0) - 0 ~99 ���� �����ϴ� sql ����
			QueryTxt = String.format("insert into examtable3(studentid, name, kor, eng, mat) values "
					+ "(%s, '%s', ROUND(RAND()*100 + 1, 0), ROUND(RAND()*100 + 1, 0), ROUND(RAND()*100 + 1, 0));"
					, i, name);
			stmt.execute(QueryTxt); // �Է¹��� sql����� �����Ѵ�.
		}
		
		stmt.close();
		conn.close();
		
	}

}
