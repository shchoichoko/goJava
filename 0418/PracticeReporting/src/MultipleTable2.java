
public class MultipleTable2 {

	public static void main(String[] args) {
		// #2 ������ �μ�(2) 22.04.18. �ּ���

		for (int k41_i = 1; k41_i < 4; k41_i++) {	
			// �Ʒ��� 3�ܱ����� ǥ���ϱ� ������ 1���� 3�ܱ����� ���.
			System.out.printf("**************\t**************\t**************\n");
			//3�ܾ� ���������� �����Ͽ� k41_i+6���� ǥ���ϱ� ���� ����
			System.out.printf("  ������ %d ��\t ������ %d ��\t ������ %d ��\n", k41_i, k41_i + 3, k41_i + 6);
			System.out.printf("**************\t**************\t**************\n");
			for (int k41_j = 1; k41_j < 10; k41_j++) {	
				//�ܼ��� 1���� 9���� �ݺ������� ���ϱ� ���� ��
				//������ 3�ܾ� ���������� �߰��ϱ� ������ ���� ǥ������.
				System.out.printf(" %d * %d = %d  \t", k41_i, k41_j, k41_i * k41_j); 
				System.out.printf(" %d * %d = %d  \t", k41_i + 3, k41_j, (k41_i + 3) * k41_j); 
				System.out.printf(" %d * %d = %d  \t\n", k41_i + 6, k41_j, (k41_i + 6) * k41_j); 
			}
		}

	}

}
