package InputOutput;

import java.util.Scanner;

public class No2438 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
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