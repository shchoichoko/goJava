
public class MultipleTable {

	public static void main(String[] args) {
		// #1 ������ �μ�(1) 22.04.18. �ּ���
		//1�ܺ��� 9�ܱ��� �� ���. k41_i+3�� �״��� �ܼ��� 3�ܾ� �ø��� ����.
		for(int k41_i = 1; k41_i < 10; k41_i=k41_i+3) {	
			System.out.printf("**************\t**************\t**************\n");
			System.out.printf("  ������ %d ��\t������ %d ��\t������ %d ��  \n", k41_i, k41_i+1, k41_i+2);	
			//1�ܾ� ���������� k41_i+2���� ǥ���ϱ� ���� ����
			System.out.printf("**************\t**************\t**************\n");
			for(int k41_j = 1; k41_j < 10; k41_j++) {	
				//�ܼ��� 1���� 9���� �ݺ������� ���ϱ� ���� ��
				//������ 1�ܾ� ���������� �߰��ϱ� ������ ���� ǥ������.
				System.out.printf(" %d * %d = %d  \t", k41_i, k41_j, k41_i * k41_j);	
				System.out.printf(" %d * %d = %d  \t", k41_i+1, k41_j, (k41_i+1) * k41_j);	
				System.out.printf(" %d * %d = %d  \t\n", k41_i+2, k41_j, (k41_i+2) * k41_j);	
			}
		}
	}

}
