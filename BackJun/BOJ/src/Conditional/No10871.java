package Conditional;

import java.util.Scanner;

public class No10871 {

	public static void main(String[] args) {
		// ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
		//��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. 
		//�־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
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
