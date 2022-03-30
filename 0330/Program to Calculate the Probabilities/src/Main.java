import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���� ���� �� �ʱ�ȭ
		N = sc.nextInt(); // �ֻ����� ����
		result = new int[N]; // ������� ������ �迭
		int diceNum = 0; // 0~(N-1)�� �ֻ����� �ǹ�

		// 2. ����Լ� ȣ��
		roll(diceNum);

	}

	private static void roll(int diceNum) {
		// 3. Ż������
		if (diceNum == N) { // N��° �ֻ����� ���� �־�����
			System.out.println(Arrays.toString(result));
			return; // print �� �޼��� ����
		} else {
			// 4. ��� Ž��
			for (int i = 1; i <= 6; i++) { // i�� 1~6���� �ش� ���� �ο�
				// 4.1 �� �ٲٱ�
				result[diceNum] = i; // n�� �ֻ����� i�� ���� �ο�
				diceNum = diceNum + 1; // n+1�� �ֻ����� �Ѿ
				// 4.2 ���ȣ��
				roll(diceNum); // n+1�� �ֻ����� ���Ͽ� ���ȣ��
				// 4.3 �� ����
				diceNum = diceNum - 1; // �ٽ� n�� �ֻ����� ����
				result[diceNum] = 0; // �� �˻��� ���� ���������� ����
			}
		}
	}
}
