package InputOutput;

import java.util.Scanner;

public class No10950 {

	public static void main(String[] args) {
		//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
			int A = 0;
			int B = 0;

		for(int i =0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	}

}
