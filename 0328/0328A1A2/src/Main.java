import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int result, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select what you want.");
		System.out.println("1. \"for\" loop\n2. \"while\" loop");
		num2 = 2;
		num3 = 2;
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("for loop");
			for (int index = 2; index < 10; index++) {
				for (int index2 = 1; index2 < 10; index2++) {
					result = index * index2;
					System.out.println(index + " X " + index2 + " = " + result);
				}
				System.out.println(" ");
			}
		}
		switch (num) {
		case 1:
			break;
		case 2: {
			System.out.println("while loop");
			while (num2 < 10) {
				
				while (num3 < 10) {
					result = num2 * num3;
					System.out.println(num2 + " X " + num3 + " = " + result);
					num3++;
				}
				num2++;
				num3=1;
				System.out.println(" ");
			}
			break;
		}
		default: {
			System.out.println("error!");
		}
		}
	}

}
