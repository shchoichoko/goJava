import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		numberMatching();
		
	}
	
	public static void numberMatching() {
		
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		int currentNumber, inputNumberOneDigit, numLength;
		System.out.println("input number 0 ot 9");
		int digit = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			currentNumber = numbers[i];
			numLength = (int) (Math.log10(numbers[i]) + 1);

			for (int j = 0; j < numLength; j++) {
				inputNumberOneDigit = currentNumber % 10;
				currentNumber /= 10;

				if (inputNumberOneDigit == digit) {
					System.out.print(numbers[i] + " ");
				}

			}

		}

	}
}
/*
int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};

Scanner sc = new Scanner(System.in);
String numbersToString = Arrays.toString(numbers);
System.out.println("Please input a number");
String inputNum = sc.nextLine();
String[] splitStr = numbersToString.split(", ");
for( int i = 0; i < splitStr.length; i++) {
	if(splitStr[i].contains(inputNum)) {
		System.out.print(splitStr[i]+ " ");
	}
}
*/