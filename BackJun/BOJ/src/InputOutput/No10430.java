package InputOutput;

import java.util.Scanner;

public class No10430 {

	public static void main(String[] args) {
		// ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C,
		// ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int thirdNum = sc.nextInt();
		System.out.println((firstNum + secondNum) % thirdNum);
		System.out.println(((firstNum % thirdNum) + (secondNum % thirdNum)) % thirdNum);
		System.out.println((firstNum * secondNum) % thirdNum);
		System.out.println(((firstNum % thirdNum) * (secondNum % thirdNum)) % thirdNum);
	}

}
