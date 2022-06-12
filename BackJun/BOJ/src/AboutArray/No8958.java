package AboutArray;

import java.util.Scanner;

public class No8958 {

	public static void main(String[] args) {
		// "OOXXOXXOOO"�� ���� OX������ ����� �ִ�.
		// O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
		// ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
		// ���� ���, 10�� ������ ������ 3�� �ȴ�.
		// "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0; // ����Ƚ��
			int sum = 0; // ���� �ջ�
			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}

	}

}
