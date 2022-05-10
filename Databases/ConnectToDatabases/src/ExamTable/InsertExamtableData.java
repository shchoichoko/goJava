package ExamTable;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class InsertExamtableData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		// ���̺� ������ �����ϱ�.
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc","root", "1234");
		Statement stmt = cnn.createStatement();
		// �� �Է� : ���̺� ���� �����Լ��� �̿��Ͽ�, 1000���� �����͸� ���� ���� ��
		int studentNumber = 1000;
		for(int i = 0; i < studentNumber; i++) {
			String studentId =String.format("kopo%04d", i+1);
			String studentName = String.format("Steve%04d", i+1);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int math = (int)(Math.random()*100);
			String QueryTxt;
			QueryTxt = String.format("insert into examtable(studentid, name, kor, eng, math) values("+"'%s','%s',%d,%d,%d);", studentId, studentName, kor, eng, math);
			stmt.execute(QueryTxt);
			studentId =""; studentName = "";
		}
		cnn.close();
		stmt.close();
		
	}

}
