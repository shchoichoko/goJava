import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetPrac {

	public static void main(String[] args) {
		// HashSet ���� �� String 5�� �Է� �޴� ���� �������� �����Ͽ� ���	
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
