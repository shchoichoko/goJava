import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n == 1) {
			System.out.println("One");
		} else if (n == 2) {
			System.out.println("Two");
		} else if (n == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Except 1, 2, 3");
		}
	}
}
