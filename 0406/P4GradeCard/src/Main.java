import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = " ";
		String[] strArr = new String[2];
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 2; i++) {
			str = sc.nextLine();
			strArr = str.split(" ");
			list.add(strArr[i]);
			
		}
		System.out.println(list);
		//Mike 80
		//Jane 70
		
		
	}
}
