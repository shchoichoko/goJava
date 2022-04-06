import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetPrac {

	public static void main(String[] args) {
		// HashSet 선언 후 String 5개 입력 받는 순간 오름차순 정렬하여 출력	
		Set hashStr = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(hashStr.size()==5) {
				break;
			}
			hashStr.add(sc.nextLine());
		}
		List hashList = new ArrayList(hashStr);
		Collections.sort(hashList);
		System.out.println(hashList);
		
	}

}
