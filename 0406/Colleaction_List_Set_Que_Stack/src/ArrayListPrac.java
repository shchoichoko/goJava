import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		// String 5개를 입력 받는 순간 오름차순 정렬하여 출력
		ArrayList<String> strArr = new ArrayList<String>(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(strArr.size()==5) {
				break;
			}
			strArr.add(sc.nextLine());
		}
		Collections.sort(strArr);
		System.out.println(strArr);
		
	}

}
