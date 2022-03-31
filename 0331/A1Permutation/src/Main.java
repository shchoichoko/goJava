import java.util.Scanner;

public class Main {
	static int firstNum, secondNum;

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.print(1);
		firstNum = sc.nextInt();
		main.print(2);
		secondNum = sc.nextInt();
		int firstValue = main.fac(firstNum);
		int secondValue = main.fac(firstNum - secondNum);
		main.print(5);
		main.print(3);
		main.print(6);
		main.print(4);
		System.out.print(") = ");
		System.out.print(firstValue / secondValue);
	}

	public int fac(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * fac(--a);
		}

	}

	public void print(int a) {
		Main main = new Main();

		if (a == 1) {
			System.out.println("Please input first number");
		} else if (a == 2) {
			System.out.println("Please input second number");
		} else if (a == 3) {
			for (int i = firstNum; i > 0; i--) {
				System.out.print(i);
				if (i != 1) {
					System.out.print(" X ");
				}
			}
		} else if (a == 4) {
			for (int i = secondNum - 1; i > 0; i--) {
				System.out.print(i);
				if (i != 1) {
					System.out.print(" X ");
				}
			}
		} else if (a == 5) {
			System.out.print("P(" + firstNum + "," + secondNum + ")");
			System.out.print(" = " + firstNum + "! / (" + firstNum + " - " + secondNum + ")! = (");
		} else if (a == 6) {
			System.out.print(") / (");
		}
	}

}
