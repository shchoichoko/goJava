package InputOutput;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է����� �־��� ���� N���� ���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int totalNum = Integer.parseInt(sc.nextLine());
		int sum = 0;
		String inputString = "";
		inputString = sc.nextLine();
		for(int i = 0; i < totalNum; i ++ ) {	
			sum += Integer.parseInt(inputString.substring(i,i+1));
		}
		System.out.println(sum);	
	}

}
