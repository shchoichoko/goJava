import java.util.ArrayList;
import java.util.Collections;

public class ArrayPrac {

	public static void main(String[] args) {
		//���� ���� 10���� for������ �ְ�
		// �������� ����
		// �������� ����
		
		ArrayList<String> ranNum = new ArrayList<String>();
		for(int i = 0; i < 10; i ++)
		{
			float num = (float)Math.random()*10;
			ranNum.add(Integer.toString((int)num));
		}
		System.out.println(ranNum);
		Collections.sort(ranNum);
		System.out.println(ranNum);
		Collections.reverse(ranNum);
		System.out.println(ranNum);
		
	}

}
