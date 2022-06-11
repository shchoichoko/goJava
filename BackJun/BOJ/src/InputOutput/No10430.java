package InputOutput;

import java.util.Scanner;

public class No10430 {

	public static void main(String[] args) {
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
		// 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
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
