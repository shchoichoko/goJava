package InputOutput;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		// (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		Scanner sc = new Scanner(System.in);
		String firstNumber = sc.nextLine();
		String secondNumber = sc.nextLine();
		int printFirst = multipleValues(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber.substring(2, 3)));
		int printSecond = multipleValues(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber.substring(1, 2)));
		int printThird = multipleValues(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber.substring(0, 1)));
		System.out.println(printFirst);
		System.out.println(printSecond);
		System.out.println(printThird);
		System.out.println(sumValues(printFirst, printSecond, printThird));
	}

	public static int multipleValues(int first, int second) {
		int result = first * second;
		return result;
	}

	public static int sumValues(int first, int second, int third) {
		int result = first + (second * 10) + (third * 100);
		return result;
	}

}
