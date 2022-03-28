import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input two numbers(First one is bigger.");
		int num1 = scanner.nextInt();
		System.out.println(" ");
		int num2 = scanner.nextInt();
		int result;
		result = num1 - num2;
		System.out.println(result);
		System.out.println("10000 - " + result / 10000);
		result = result % 10000;
		System.out.println("5000 - " + result / 5000);
		result = result % 5000;
		System.out.println("1000 - " + result / 1000);
		result = result % 1000;
		System.out.println("500 - " + result / 500);
		result = result % 500;
		System.out.println("100 - " + result / 100);
		result = result % 100;
		System.out.println("50 - " + result / 50);
		result = result % 50;
		System.out.println("10 - " + result / 10);
		result = result % 10;
		System.out.println("³²Àº µ· : "+result);
	}
	
}
