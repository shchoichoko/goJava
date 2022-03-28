import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number.");
		int num1 = scanner.nextInt();
		System.out.print(num1 % 3);
		num1 = num1/3;
		System.out.print(num1 % 3);
		num1 = num1/3;
		System.out.print(num1 % 3);
	}

}
