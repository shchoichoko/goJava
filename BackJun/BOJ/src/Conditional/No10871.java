package Conditional;

import java.util.Scanner;

public class No10871 {

	public static void main(String[] args) {
		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
		//주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] intArray = new int[N];
		String output = "";
		for(int i = 0; i < N; i ++) {
			intArray[i] = sc.nextInt();
			if(intArray[i]<X) {
				output += Integer.toString(intArray[i])+" ";
			}
		}
		System.out.print(output.trim());
	}
}
