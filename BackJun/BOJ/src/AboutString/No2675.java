package AboutString;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		// ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), 
		// ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
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
