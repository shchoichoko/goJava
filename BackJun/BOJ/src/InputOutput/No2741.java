package InputOutput;

import java.util.Scanner;

public class No2741 {

	public static void main(String[] args) {
		// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		for(int i = 0; i < maxNum; i ++) {
			System.out.println(i+1);
		}
	}

}
