package InputOutput;

import java.util.Scanner;

public class No11719 {

	public static void main(String[] args) {
		// 입력받은 그대로 출력한다.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String a = sc.nextLine();
			System.out.println(a);
		}
		sc.close();
	}

}
