
public class Calendar {

	public static void main(String[] args) {
		// #2 �޷� �μ� 22.04.18. �ּ���
		int k41_iWeekday = 5;
		int[] k41_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int k41_iMon = 0; k41_iMon < 12; k41_iMon++) {
			System.out.printf("\n\n	%d��\n", k41_iMon + 1);
			System.out.printf("====================\n");
			System.out.printf(" �� �� ȭ �� �� �� �� \n");

			for(int i = 0; i < k41_iWeekday; i++) {
				System.out.printf("  ");
			}
			
			for (int k41_i = 1; k41_i <= k41_iEnd[k41_iMon]; k41_i++) {
				
				System.out.printf("%d ", k41_i);
				k41_iWeekday++;
				if(k41_iWeekday==7) {
					System.out.println("");
					k41_iWeekday = 0;
				}
			}

		}

	}

}
