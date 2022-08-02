package InputOutput;

import java.util.Scanner;

public class No2742 {

	public static void main(String[] args) {
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		for(int i = maxNum; i > 0; i --) {
			System.out.println(i);
		}
	}

}
