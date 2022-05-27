package InputOutput;

import java.util.Scanner;

public class No10951 {

	public static void main(String[] args) {
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		int A = 0,B=0;
		while(sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
	}

}
