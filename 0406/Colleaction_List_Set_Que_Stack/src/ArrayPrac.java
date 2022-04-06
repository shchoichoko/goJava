import java.util.ArrayList;
import java.util.Collections;

public class ArrayPrac {

	public static void main(String[] args) {
		//랜덤 숫자 10개를 for문으로 넣고
		// 오름차순 정렬
		// 내림차순 정렬
		
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
