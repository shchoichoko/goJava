import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
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
