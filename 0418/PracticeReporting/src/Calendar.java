
public class Calendar {

	public static void main(String[] args) {
		// #2 �޷� �μ� 22.04.18. �ּ���
		int k41_iWeekday = 5; // 1��1���� �ݿ���
		int[] k41_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		// ������ �⵵�� �޸��� ���������� ��Ƶ� �迭
		for (int k41_iMon = 0; k41_iMon < 12; k41_iMon++) { 
			// �迭�� ���� ��� �ϹǷ� 0~11���� for�� ����
			System.out.printf("\t %2d��\n", k41_iMon + 1); 
			// k41_iMon�� 0���� �����ϹǷ� +1
			System.out.printf("=====================\n");
			System.out.printf(" �� �� ȭ �� �� �� ��\n");
			for (int k41_j = 0; k41_j < k41_iWeekday; k41_j++) {
				System.out.printf("   "); 
				// ���۳���ŭ ��ĭ ����ϱ�.
			}
			for (int k41_i = 1; k41_i < k41_iEnd[k41_iMon]+1; k41_i++) {
				// k41_i�� 1�Ϻ��� ������������ ��� 
				if (k41_iWeekday % 7 == 6) { 
					// k41_iWeekday�� 7�� ������ �������� 6 �� �� �� �� ����
					System.out.printf("%3d\n", k41_i);
					k41_iWeekday -= 7; 
					// �ٽ� ������ ����ϱ� ���� -7
				} else { 
					// �������� 6�� �ƴ϶�� ��¥ ���
					System.out.printf("%3d", k41_i);
				}
				k41_iWeekday++;
				//k41_iWeekday 1�� ����
			}
			System.out.printf("\n\n"); 
			// �Ѵ��� ���� �� �� ����
		}
	}
}
