package AboutArray;

import java.util.Scanner;

public class No2562 {

	public static void main(String[] args) {
//		9���� ���� �ٸ� �ڿ����� �־��� ��, 
//		�̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ���, ���� �ٸ� 9���� �ڿ���
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//		�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		Scanner sc = new Scanner(System.in);
		int [] naturalNum = new int[9];
		int maxValue = 0, cnt = 1, positionNum = 0;
		for(int i = 0; i < 9; i ++ ) {
			naturalNum[i] = sc.nextInt();
			if(maxValue < naturalNum[i]) {
				maxValue = naturalNum[i];
				positionNum = cnt;
			}
			cnt ++;
		}
		System.out.println(maxValue);
		System.out.println(positionNum);
	}

}
