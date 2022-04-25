import java.util.Scanner;

public class GetFV {

	public static void main(String[] args) {
		/*
		 * rate 필수 요소입니다. 기간별 이자율입니다. nper 필수 요소입니다. 총 납입 기간 수입니다. pmt 필수 요소입니다. 각 기간의
		 * 납입액으로서 전 기간 동안 일정합니다. 일반적으로 pmt에는 기타 비용과 세금을 제외한 원금과 이자가 포함됩니다.
		 */
		int rate = print(1);
		int nper = print(2);
		int pmt = print(3);
		System.out.printf("FV = %.4f", getFV(rate, nper, pmt));
	}

	public static double getFV(int rate, int nper, int pmt) {
		double fv = 0; // 미래가치
		double rateNum = 1;// 제곱 완료한 이율
		for (int j = 0; j < nper; j++) {
			rateNum *= (100 + rate) / 100.0; // 제곱을 위한 식
			fv += rateNum * pmt;
		}
		return fv;
	}

	public static int print(int order) {
		Scanner sc = new Scanner(System.in);
		int returnValue = 0;
		if (order == 1) {
			System.out.println("Please input the rate");
			returnValue = sc.nextInt();
		} else if (order == 2) {
			System.out.println("Please input the nper");
			returnValue = sc.nextInt();
		} else {
			System.out.println("Please input the pmt");
			returnValue = sc.nextInt();
		}
		return returnValue;
	}
}
