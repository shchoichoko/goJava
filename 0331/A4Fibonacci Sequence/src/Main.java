import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		System.out.println("Please input a number");
		int fiboNum = sc.nextInt();
		for (int i = 0; i < fiboNum; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}
}