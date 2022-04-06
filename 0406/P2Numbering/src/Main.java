import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	// 1 21 13 34 15 16
	public static void main(String[] args) {

		checkNum(input(1), input(2));

	}

	public static void checkNum(String inputStr, String check) {

		Queue<String> num = new LinkedList<String>();
		String[] arr = new String[inputStr.length()];
		int count = 0;
		arr = inputStr.split(" ");
		for (int i = 0; i < arr.length; i++) {
			num.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(check)) {
				break;
			}
			num.poll();
			count++;
		}
		System.out.println(count + 1);

	}

	public static String input(int order) {
		Scanner sc = new Scanner(System.in);
		String inputStr = " ";
		if (order == 1) {
			inputStr = sc.nextLine();
		} else if (order == 2) {
			inputStr = sc.nextLine();
		}
		return inputStr;
	}

}
