import java.util.Scanner;

public class GetFV {

	public static void main(String[] args) {
		/*
		 * rate �ʼ� ����Դϴ�. �Ⱓ�� �������Դϴ�. nper �ʼ� ����Դϴ�. �� ���� �Ⱓ ���Դϴ�. pmt �ʼ� ����Դϴ�. �� �Ⱓ��
		 * ���Ծ����μ� �� �Ⱓ ���� �����մϴ�. �Ϲ������� pmt���� ��Ÿ ���� ������ ������ ���ݰ� ���ڰ� ���Ե˴ϴ�.
		 */
		int rate = print(1);
		int nper = print(2);
		int pmt = print(3);
		System.out.printf("FV = %.4f", getFV(rate, nper, pmt));
	}

	public static double getFV(int rate, int nper, int pmt) {
		double fv = 0; // �̷���ġ
		double rateNum = 1;// ���� �Ϸ��� ����
		for (int j = 0; j < nper; j++) {
			rateNum *= (100 + rate) / 100.0; // ������ ���� ��
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
