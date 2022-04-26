package Review01;

import java.util.Scanner;

public class ComparingTwoStrings {
	public static void main(String[] args) {
		int checkNum = 0;
		while (true) {
			System.out.println("************************************");
			String firstString = print(1);
			String secondString = print(2);
			checkString(firstString, secondString);
		}
	}

	public static void checkString(String inputString, String secondString) {
		int[] saveStr = new int[inputString.length()];
		int[] saveStr2 = new int[secondString.length()];
		int cnt = 0;
		String answer = "yes!";
		if (inputString.length() == secondString.length()) {
			for (int i = 0; i < inputString.length(); i++) {
				saveStr[i] = inputString.charAt(i);
				saveStr2[i] = secondString.charAt(i);
			}
			for (int i = 0; i < inputString.length(); i++) {
				cnt = 0;
				for (int j = 0; j < inputString.length(); j++) {
					if (saveStr[i] != saveStr2[j]) {
						cnt++;
						if (cnt == inputString.length()) {
							answer = "NO!";
						}
					}
				}
			}
		} else {
			answer = "NO!";
		}
		System.out.println(answer);
	}

	public static String print(int order) {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		if (order == 1) {
			System.out.println("Please input the first alphabet set");
			inputString = sc.nextLine();
		} else {
			System.out.println("Please input the second alphabet set");
			inputString = sc.nextLine();
		}
		return inputString;
	}
}
