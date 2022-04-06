import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		checkCha(inputString(1), inputString(2));
	}

	public static String inputString(int order) {
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		if (order == 1) {
			System.out.println("Please input the first word");
			inputString = sc.nextLine();
		} else if (order == 2) {
			System.out.println("Please input the second word");
			inputString = sc.nextLine();
		}
		return inputString;
	}

	public static void checkCha(String str1, String str2) {
		List<String> strArr = new ArrayList<String>();
		List<String> strArr2 = new ArrayList<String>();

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			strArr.add(String.valueOf(str1.charAt(i)));
		}
		for (int i = 0; i < str2.length(); i++) {
			strArr2.add(String.valueOf(str2.charAt(i)));
		}
		Set<String> strSet = new HashSet<String>(strArr);
		Set<String> strSet2 = new HashSet<String>(strArr2);
		
		for (int i = 0; i < strSet.size(); i++) {
			for (int j = 0; j < strSet2.size(); j++) {
				if (strArr.get(i).equals(strArr2.get(j))) {
					count++;
				}
			}
		}
		
		System.out.println(strArr.size());
		System.out.println(strArr2.size());
		System.out.println(count);
	}

}
