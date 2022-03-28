import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number for Multiplication Table");
		int inputNum = sc.nextInt();
		int result = 0;
		for (int index = 2; index < 10; index++) {
			result = 3 * index;
			System.out.println(inputNum + " X " + index + " = " + result);
		}
	}
}
