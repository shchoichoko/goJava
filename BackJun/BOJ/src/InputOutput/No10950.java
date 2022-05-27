package InputOutput;

import java.util.Scanner;

public class No10950 {

	public static void main(String[] args) {
		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
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
