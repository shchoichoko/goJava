package InputOutput;

import java.util.Scanner;

public class No2439 {

	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		// ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		sc.close();
		for(int i = 1; i <= inputNum; i ++) {
	    	for (int j = 1; j <= inputNum - i; ++j) {
	        	System.out.print(" ");
	        }
	        for (int j = 1; j <= i; ++j) {
	        	System.out.print("*");
	        }
	        if(i==inputNum) {
	        	break;
	        }
	        System.out.println();
		}
	}

}
