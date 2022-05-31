package InputOutput;

import java.util.Scanner;

public class No10953 {

	public static void main(String[] args) {
		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
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
