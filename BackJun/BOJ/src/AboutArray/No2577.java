package AboutArray;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
//		세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 
//		각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//		예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int thirdNum = sc.nextInt();
		doCalculate(firstNum, secondNum, thirdNum);

	}

	public static void doCalculate(int firstNum, int secondNum, int thirdNum) {
		String calculateResult = Integer.toString((firstNum * secondNum * thirdNum));
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < calculateResult.length(); j++) {
				if (i == Character.getNumericValue(calculateResult.charAt(j))) {
					count++;
				}
			}
			System.out.println(count);
			
		}
	}

}
