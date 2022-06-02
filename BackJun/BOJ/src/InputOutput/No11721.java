package InputOutput;

import java.util.Scanner;

public class No11721 {

	public static void main(String[] args) {
		// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		int cutNum = inputStr.length()/10;
		String outputStr = "";
		for(int i = 0; i < cutNum; i++) {
			outputStr = inputStr.substring((i*10),10*(i+1));
			System.out.println(outputStr);
		}
		System.out.println(inputStr.substring((cutNum*10),inputStr.length()));
	}

}
