package InputOutput;

import java.util.Scanner;

public class No2739 {

	public static void main(String[] args) {
		// 구구단
		// 출력형식과 같게 N*1부터 N*9까지 출력한다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i < 10; i ++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
