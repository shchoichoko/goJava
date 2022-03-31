import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		main.print();
		int num = sc.nextInt();
		main.calculate(num);

	}

	public void calculate(int num) {
		int result = 0;
		if (num > 1 && num < 10) {
			for (int index = 1; index < 10; index++) {
				result = num * index;
				System.out.println(num + " X " + index + " = " + result);
			}
		} else {
			System.out.println("Error!!");
		}

	}

	public void print() {
		System.out.println("Please input a number");

	}

}
