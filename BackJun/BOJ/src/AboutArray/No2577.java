package AboutArray;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
//		�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� 
//		������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
//		����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
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
