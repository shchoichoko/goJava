package Review01;

import java.util.Scanner;

public class ComparingTwoStrings {
	public static void main(String[] args) {
		int checkNum = 0;
		while (true) {
			String firstString = print(1);
			String secondString = print(2);
			checkNum = checkString(firstString, secondString);
			if (checkNum == 1) {
				break;
			}
		}
	}

	public static int checkString(String inputString, String secondString) {
		int firstNum = 0;
		int secondNum = 0;
		int check = 0;
		if (inputString.length() == secondString.length()) {
			for (int i = 0; i < inputString.length(); i++) {
				char ch = inputString.charAt(i);
				if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
					System.out.println("¾ËÆÄºªÀÌ ¾Æ´Õ´Ï´Ù.");
					check = 1;
					break;
				}
				firstNum += ch;
			}
			for (int i = 0; i < inputString.length(); i++) {
				char ch = inputString.charAt(i);
				if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
					System.out.println("¾ËÆÄºªÀÌ ¾Æ´Õ´Ï´Ù.");
					check = 1;
					break;
				}
				secondNum += ch;
			}
		}
		if (firstNum != secondNum) {
			System.out.println("No!");
		} else {
			System.out.println("Yes!");
		}
		return check;
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
