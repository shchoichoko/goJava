import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number");
		int num1 = sc.nextInt();
		int num2 = 1;
		int count = 0;
		for (int i = 2; i < num1 + 1; i++) {
			for (num2 = 2; num2 < i + 1; num2++) {
				if (i % num2 == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
			count = 0;
		}
	}

}
