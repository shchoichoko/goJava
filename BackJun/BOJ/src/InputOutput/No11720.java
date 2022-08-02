package InputOutput;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		// 입력으로 주어진 숫자 N개의 합을 출력한다.
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
