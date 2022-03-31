import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 입력 받기. 배수로 쓸 숫자 받기. 배수와 합친 값 출력
		// 20 , 5 Sum: 50(5,10,15,20)
		int num = 0;int num2 = 0;int sum = 0;
		System.out.println("Please input the first number");
		num = sc.nextInt();
		System.out.println("Please input the second number");
		num2 = sc.nextInt();
		if (num < num2) {
			System.out.println("Error!!");
		} else {

			for (int i = 0; i < num + 1; i++) {
				if (i % num2 == 0) {
					sum += i;
				}
			}
		}
		System.out.print("SUM : " + sum + "(");
		for (int i = 1; i < num + 1; i++) {
			if (i % num2 == 0) {
				System.out.print(i);
				if (num != i) {
					System.out.print(",");
				}
			}
		}
		System.out.print(")");
	}

}
