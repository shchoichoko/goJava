import java.util.Scanner;

public class Main {
	static int firstNum = 0, secondNum = 0;
	static double originalNum = 0, finalValue;

	public static void main(String[] args) {
		Print pt = new Print();
		pt.printMenu();
		inputUnit();
		convert(originalNum, firstNum);
		System.out.printf("%.2f", finalValue);
	}

	public static void inputUnit() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String intStr = "";

		if (str.length() >= 4) {
			System.out.println("Error!");
		} else {

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (48 <= ch && ch <= 57) {
					intStr += ch;
				}
			}
			firstNum = Integer.parseInt(intStr.substring(0, 1));
			secondNum = Integer.parseInt(intStr.substring(1, 2));

		}

		originalNum = sc.nextDouble();
	}

	public static void convert(double original, double first) {

		if (first == 1) {
			if (secondNum == 1) {
				finalValue = original * 1;
			} else if (secondNum == 2) {
				finalValue = original / 100;
			} else if (secondNum == 3) {
				finalValue = original * 10;
			} else if (secondNum == 4) {
				finalValue = original / 100000;
			} else if (secondNum == 5) {
				finalValue = original / 16934;
			}
		} else if (first == 2) {
			if (secondNum == 1) {
				finalValue = original * 100;
			} else if (secondNum == 2) {
				finalValue = original * 1;
			} else if (secondNum == 3) {
				finalValue = original * 1000;
			} else if (secondNum == 4) {
				finalValue = original / 1000;
			} else if (secondNum == 5) {
				finalValue = original / 1609;
			}
		} else if (first == 3) {
			if (secondNum == 1) {
				finalValue = original / 10;

			} else if (secondNum == 2) {
				finalValue = original / 1000;
			} else if (secondNum == 3) {
				finalValue = original * 1;
			} else if (secondNum == 4) {
				finalValue = original / 1000000;
			} else if (secondNum == 5) {
				finalValue = original / 0.0000016;
			}
		} else if (first == 4) {
			if (secondNum == 1) {
				finalValue = original * 100000;
			} else if (secondNum == 2) {
				finalValue = original * 1000;
			} else if (secondNum == 3) {
				finalValue = original * 1000000;
			} else if (secondNum == 4) {
				finalValue = original * 1;
			} else if (secondNum == 5) {
				finalValue = original / 1.609;
			}
		} else if (first == 5) {
			if (secondNum == 1) {
				finalValue = original * 160934;
			} else if (secondNum == 2) {
				finalValue = original * 1609.34;
			} else if (secondNum == 3) {
				finalValue = original * 1609340;
			} else if (secondNum == 4) {
				finalValue = original * 1.609;
			} else if (secondNum == 5) {
				finalValue = original * 1;
			}
		}

	}
}
