package InputOutput;

import java.util.Scanner;

public class No11721 {

	public static void main(String[] args) {
		// ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
		// �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
