import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScoreJsonMake {

	public static JSONObject oneRec(String k41_name, int k41_studentid, int k41_kor, int k41_eng, int k41_mat) {
		JSONObject k41_dataObject = new JSONObject();
		//JSON ��ü ����.k41_dataObject
		k41_dataObject.put("k41_name", k41_name);		//k41_dataObject�� k41_name �׸� �Ű������� ���� �̸��� �־��ش�.
		k41_dataObject.put("k41_studentid", k41_studentid);	////k41_dataObject�� k41_studentid �׸� �Ű������� ���� �л���ȣ�� �־��ش�.
		//JSON Array ����
		JSONArray k41_score = new JSONArray();		
		k41_score.add(k41_kor); k41_score.add(k41_eng); k41_score.add(k41_mat);	//JSONArray�� �Ű������� ���� �͵��� add()�� �̿��� �־��ش�.
		k41_dataObject.put("k41_score", k41_score);	//JSONArray�� ���� ���� �������� �ٽ� k41_dataObject�� put()���� �־��ش�.
		
		return k41_dataObject;
	}
	
	public static void main(String[] args) {
		JSONArray k41_datasArray = new JSONArray();		//JSONArray ��ü ����	    k41_datasArray
		JSONObject k41_dataObject = new JSONObject();	//JSONObject ��ü ����. 	k41_dataObject
		k41_dataObject.put("k41_name", "����");			// JSONObject�� �׸񺰷� ���� �ִ� ���.
		k41_dataObject.put("k41_studentid", "209901");
		
		JSONArray k41_score = new JSONArray();		// JSONArray ��ü ����."����"�� �������� �־��ֱ� ����.	
		k41_score.add(90);k41_score.add(100);k41_score.add(95);		
		k41_dataObject.put("k41_score", k41_score);	//JSONObject�� ���� JSONArray��ü�� ���� ������ �־��ش�.
		k41_datasArray.add(k41_dataObject);	//	���� ���� -> k41_score JSONArray -> k41_dataObject JSONObject -> k41_datasArray JSONArray �� ����.
		
		k41_datasArray.add(oneRec("����", 209902,100,85,75));	//������ ���� oneRec�� �̿��� k41_dataObject�� ������ �� �ٽ� k41_datasArray�� �־��ش�.
		k41_datasArray.add(oneRec("���", 209903,90,75,85));
		k41_datasArray.add(oneRec("�糪", 209904,90,85,75));
		k41_datasArray.add(oneRec("��ȿ", 209905,80,75,85));
		k41_datasArray.add(oneRec("�̳�", 209906,90,85,55));
		k41_datasArray.add(oneRec("����", 209907,70,75,65));
		k41_datasArray.add(oneRec("ä��", 209908,100,75,95));
		k41_datasArray.add(oneRec("����", 209909,80,65,95));

		try {
			FileWriter k41_file = new FileWriter("C:\\Users\\������\\Desktop\\����\\Data\\test.json");
			// �ش� ��ο� ������ �ۼ��Ѵ�.
			k41_file.write(k41_datasArray.toJSONString());	//������ �־��� �������� toJSONString�� �ٲ۵� �ۼ��Ѵ�.
			k41_file.flush();	//���ۿ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ�� �������� ���۸� ����.
			k41_file.close();	// �����ۼ� ��ü�� �ݾ��ش�.
		} catch (IOException k41_e) {
			k41_e.printStackTrace();	//���� �߻��� ��� ��� �߸��ƴ��� ��������.
		}
		System.out.println("JSON ����� : " + k41_datasArray);
	}

}
