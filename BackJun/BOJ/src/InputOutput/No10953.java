package InputOutput;

import java.util.Scanner;

public class No10953 {

	public static void main(String[] args) {
		//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		String a = "";
		int c = 0,d = 0;
		for( int i = 0; i < T; i++) {
			a = sc.nextLine();
			c = Integer.parseInt(a.substring(0,1));
			d = Integer.parseInt(a.substring(2,3));
			System.out.println(c+d);
		}
		
		
	}

}
