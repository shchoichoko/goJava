import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//User inputs a string
		//Print the words after splitting it against by a black(¡° ¡°)
		//Sort them by in descending order and print them again
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
	}
	
}
