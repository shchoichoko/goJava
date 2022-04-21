import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScoreJsonMake {

	public static JSONObject oneRec(String k41_name, int k41_studentid, int k41_kor, int k41_eng, int k41_mat) {
		JSONObject k41_dataObject = new JSONObject();
		//JSON 객체 생성.k41_dataObject
		k41_dataObject.put("k41_name", k41_name);		//k41_dataObject에 k41_name 항목에 매개변수로 받은 이름을 넣어준다.
		k41_dataObject.put("k41_studentid", k41_studentid);	////k41_dataObject에 k41_studentid 항목에 매개변수로 받은 학생번호를 넣어준다.
		//JSON Array 생성
		JSONArray k41_score = new JSONArray();		
		k41_score.add(k41_kor); k41_score.add(k41_eng); k41_score.add(k41_mat);	//JSONArray에 매개변수로 받은 것들을 add()를 이용해 넣어준다.
		k41_dataObject.put("k41_score", k41_score);	//JSONArray로 받은 과목별 점수들을 다시 k41_dataObject에 put()으로 넣어준다.
		
		return k41_dataObject;
	}
	
	public static void main(String[] args) {
		JSONArray k41_datasArray = new JSONArray();		//JSONArray 객체 생성	    k41_datasArray
		JSONObject k41_dataObject = new JSONObject();	//JSONObject 객체 생성. 	k41_dataObject
		k41_dataObject.put("k41_name", "나연");			// JSONObject에 항목별로 따로 넣는 방법.
		k41_dataObject.put("k41_studentid", "209901");
		
		JSONArray k41_score = new JSONArray();		// JSONArray 객체 생성."나연"의 점수들을 넣어주기 위함.	
		k41_score.add(90);k41_score.add(100);k41_score.add(95);		
		k41_dataObject.put("k41_score", k41_score);	//JSONObject에 위에 JSONArray객체에 넣은 점수를 넣어준다.
		k41_datasArray.add(k41_dataObject);	//	나연 정보 -> k41_score JSONArray -> k41_dataObject JSONObject -> k41_datasArray JSONArray 에 저장.
		
		k41_datasArray.add(oneRec("정연", 209902,100,85,75));	//위에서 만든 oneRec을 이용해 k41_dataObject에 저장한 뒤 다시 k41_datasArray에 넣어준다.
		k41_datasArray.add(oneRec("모모", 209903,90,75,85));
		k41_datasArray.add(oneRec("사나", 209904,90,85,75));
		k41_datasArray.add(oneRec("지효", 209905,80,75,85));
		k41_datasArray.add(oneRec("미나", 209906,90,85,55));
		k41_datasArray.add(oneRec("다현", 209907,70,75,65));
		k41_datasArray.add(oneRec("채영", 209908,100,75,95));
		k41_datasArray.add(oneRec("쯔위", 209909,80,65,95));

		try {
			FileWriter k41_file = new FileWriter("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\test.json");
			// 해당 경로에 파일을 작성한다.
			k41_file.write(k41_datasArray.toJSONString());	//위에서 넣었던 정보들을 toJSONString로 바꾼뒤 작성한다.
			k41_file.flush();	//버퍼에 저장되어 있는 내용을 클라이언트로 전송한후 버퍼를 비운다.
			k41_file.close();	// 파일작성 객체를 닫아준다.
		} catch (IOException k41_e) {
			k41_e.printStackTrace();	//에러 발생할 경우 어디가 잘못됐는지 추적해줌.
		}
		System.out.println("JSON 만든거 : " + k41_datasArray);
	}

}
