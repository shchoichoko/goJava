import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//선생님이 주신 힌트
		int addNum = 0;
		int remain = 0;
		int count = 0;
		int avg = 0;
		int maxNum = 0;
		int minNum = 0;
		while (true) {
			System.out.println("Please input a number");
			addNum = sc.nextInt();
			if (minNum == 0) {
				minNum = addNum;
			}
			if (minNum > addNum) {
				minNum = addNum;
			}
			remain = remain + addNum;
			if (maxNum < addNum) {
				maxNum = addNum;
			}
			count++;
			avg = remain / count;
			System.out.println(
					"Result :" + count + " - " + "MEAN " + avg + " , " + "Max " + maxNum + " , " + "Min " + minNum);
			System.out.println("=============");
		}

	}

}
