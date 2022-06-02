package InputOutput;

import java.util.Scanner;

public class No11022 {

	public static void main(String[] args) {
		// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		//x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String str  = "";
		int a = 0, b = 0;
		for(int i = 0; i < t; i ++) {
			str = sc.nextLine();
			a = Integer.parseInt(str.substring(0,1));
			b = Integer.parseInt(str.substring(2,3));
			System.out.printf("Case #%d: %d + %d = %d\n",(i+1),a,b,(a+b));
		}
		sc.close();
	}

}
