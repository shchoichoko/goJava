package InputOutput;

import java.util.Scanner;

public class No10951 {

	public static void main(String[] args) {
		// �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		int A = 0,B=0;
		while(sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
	}

}
