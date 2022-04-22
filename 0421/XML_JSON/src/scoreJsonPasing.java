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
		// JSONParser 선언
		Object k41_obj = k41_paser.parse(new FileReader("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\test.json"));
		// 읽어올 제이슨 파일의 경로와 이름 지정.
		JSONArray k41_array = (JSONArray)k41_obj;
		// JSONArray 선언
		System.out.println("**********************************************");
		//학생 수만큼 도는 for문 작성
		for(int k41_i = 0; k41_i < k41_array.size(); k41_i++) {
			//i번째 학생 데이터를 가져와서 k41_result에 넣는다.
			JSONObject k41_result = (JSONObject) k41_array.get(k41_i);
			System.out.println("이름 : " + k41_result.get("k41_name"));
			System.out.println("학번 : " + k41_result.get("k41_studentid"));
			
			JSONArray k41_score = (JSONArray) k41_result.get("k41_score");
			//k41_score로 과목별 점수를 가져온다.
			long k41_kor = (long)k41_score.get(0);
			long k41_eng = (long)k41_score.get(1);
			long k41_mat = (long)k41_score.get(2);
			
			System.out.println("국어 : " + k41_kor);
			System.out.println("영어 : " + k41_eng);
			System.out.println("수학 : " + k41_mat);
			System.out.println("총점 : " + (k41_kor + k41_eng + k41_mat));
			
			System.out.printf("평균 : %.0f\n" , (k41_kor + k41_eng + k41_mat)/3.0);
			System.out.println("**********************************************");
			
		}
	}

}
