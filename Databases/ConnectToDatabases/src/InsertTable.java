import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//���̺� ������ ����.
		Class.forName("com.mysql.jdbc.Driver");//Driver Ŭ���� �ҷ�����.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc",
				"root","1234");//DB������ ���� Connection ��ü ����.
		Statement stmt = conn.createStatement();//���� ������ ���� Connection ��ü ����.
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('����',209901,95,100,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('����',209902,95,95,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('���',209903,100,100,100);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('�糪',209904,100,95,90);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('��ȿ',209905,80,100,70);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('�̳�',209906,95,90,95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('����',209907,100,90,100);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('ä��',209908,100,75,90);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values('����',209909,100,100,70);");
		//���� �������ش�.
		stmt.close();
		conn.close();
		
	}

}
