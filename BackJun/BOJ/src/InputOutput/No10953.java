package InputOutput;

import java.util.Scanner;

public class No10953 {

	public static void main(String[] args) {
		//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		System.out.println("");
		String A = " ";
		int C = 0;
		for( int i = 0; i< T; i++) {
			A = sc.nextLine();
			C = Integer.parseInt(A.substring(0,1))+Integer.parseInt(A.substring(2, 2));
			System.out.println(C);
		}
		
		
	}

}
