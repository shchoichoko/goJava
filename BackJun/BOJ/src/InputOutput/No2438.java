package InputOutput;

import java.util.Scanner;

public class No2438 {

	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		// ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		for(int i = 0; i < inputNum; i ++) {
			for(int j = 0; j < i+1 ; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
	}

}