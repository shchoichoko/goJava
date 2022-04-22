import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonPasing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser k41_paser = new JSONParser();
		// JSONParser ����
		Object k41_obj = k41_paser.parse(new FileReader("C:\\Users\\������\\Desktop\\����\\Data\\test.json"));
		// �о�� ���̽� ������ ��ο� �̸� ����.
		JSONArray k41_array = (JSONArray)k41_obj;
		// JSONArray ����
		System.out.println("**********************************************");
		//�л� ����ŭ ���� for�� �ۼ�
		for(int k41_i = 0; k41_i < k41_array.size(); k41_i++) {
			//i��° �л� �����͸� �����ͼ� k41_result�� �ִ´�.
			JSONObject k41_result = (JSONObject) k41_array.get(k41_i);
			System.out.println("�̸� : " + k41_result.get("k41_name"));
			System.out.println("�й� : " + k41_result.get("k41_studentid"));
			
			JSONArray k41_score = (JSONArray) k41_result.get("k41_score");
			//k41_score�� ���� ������ �����´�.
			long k41_kor = (long)k41_score.get(0);
			long k41_eng = (long)k41_score.get(1);
			long k41_mat = (long)k41_score.get(2);
			
			System.out.println("���� : " + k41_kor);
			System.out.println("���� : " + k41_eng);
			System.out.println("���� : " + k41_mat);
			System.out.println("���� : " + (k41_kor + k41_eng + k41_mat));
			
			System.out.printf("��� : %.0f\n" , (k41_kor + k41_eng + k41_mat)/3.0);
			System.out.println("**********************************************");
			
		}
	}

}
