
public class PrintPyramid {

	public static void main(String[] args) {
		// #16 �Ƕ�̵� ��� ��� 22.04.15 csh 
		int k41_n, k41_m;	//�� �� ���� ������ ��ĭ ������ ���� ������ ����.
		k41_n = 1; k41_m = 20;	// �ʱ� ���� ������ 1, ��ĭ ������ 20���� ����.
		
		while(true) {
			for(int k41_i = 0; k41_i < k41_m; k41_i++) {
				System.out.printf(" ");	//k41_m�� ���� ���� ��ĭ ��� 
			}
			for(int k41_i = 0; k41_i < k41_n; k41_i++) {
				System.out.printf("*");	//k41_n�� ���� ���� �� ��� 
			}
			System.out.printf("\n");
			k41_m = k41_m - 1;	// ��ĭ ������ �ϳ��� ���̰�, break���� ������  ����.
			k41_n = k41_n + 2;	// ���� ������ 2�� ������Ŵ.
			
			if (k41_m < 0) break;	// k41_m�� 0���� �۾����� �ݺ��� ����.
		}
		
		
	}

}
