import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� ['Life', 'is', 'too', 'short'] ����Ʈ�� "Life is too short" ���ڿ��� ����� ����� ����.
		List<String> list = new ArrayList<>(Arrays.asList("Life","is", "too", "short"));
		String str = "";
		for(int i = 0; i < list.size(); i++) {
			str += list.get(i);
			str += " ";
		}
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}

}
