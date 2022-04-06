import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Iterator_prac {

	public static void main(String[] args) {
		//랜덤 숫자 10개를 for문으로 넣고, 오름차순으로 정렬.
		//가운데 있는 숫자 2개를 제외한 나머지 8개 출력하기.
		
		List<Integer> num = new ArrayList<>();
		int a = 0;
		for( int i = 0; i < 10; i++) {
			num.add((int) (Math.random()*100));
		}
		Collections.sort(num);
		System.out.print(num);
		System.out.println(" ");
		for(int i = 0; i < num.size(); i++) {
			if(i != num.size()/2-1 && i != num.size()/2) {
				System.out.print(num.get(i));
				System.out.print(" ");
			}
		}
	}

}
