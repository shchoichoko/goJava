package AboutString;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 
		// 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int repeatTime = 0;
		String strS = "";
		for(int i = 0; i < caseNum; i ++) {
			 repeatTime = sc.nextInt();	
			 strS = sc.nextLine().trim();
			 for(int j = 0; j < strS.length(); j ++ ) {
				 for(int repeat = 0; repeat < repeatTime; repeat++ ) {
					 System.out.print(strS.charAt(j));
				 }
			 }
			 System.out.println();
		}

	}

}
