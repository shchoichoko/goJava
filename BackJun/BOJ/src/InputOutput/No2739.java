package InputOutput;

import java.util.Scanner;

public class No2739 {

	public static void main(String[] args) {
		// ������
		// ������İ� ���� N*1���� N*9���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i < 10; i ++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
