
public class whilePrintStars {

	public static void main(String[] args) {
		//#4 While���� ����ؼ� �� ��� 22.04.15 csh
		
		int k41_iA, k41_iB;		// k41_iA �� �ٹٲ��� ���� ����, k41_iB �� �� ��⸦ ���� �����̴�.
		k41_iA = 0;				// k41_iA�� ���� 0���� �ʱ�ȭ�Ѵ�.
		while(true) {			// break������ ������ ������ �ݺ��Ϸ��� ��
			k41_iB = 0;			// �ؿ��� ����Ǿ��� k41_iB���� 0���� �ٽ� �ʱ�ȭ ����.
			while(true) {		// break�� �������� ������ ���� �ݺ�
				System.out.printf("*");	// �� ���
				
				if(k41_iA == k41_iB) {	 
					break;			// k41_iA�� k41_iB�� ���� ���� �� ���� while�� ����������
				}
				k41_iB++;		//k41_iB�� 1����( k41_iA�� ���� �����ϱ� ����)
			}
			System.out.printf("\n");	// �� �ٲٱ�
			k41_iA++;					// ���� ������ �ø��� ���� �뵵 + 30�϶� ���������� ���� �뵵.
			if(k41_iA == 30) break;	// k41_iA �� 30�϶� while�� ������ ����������.
		}
		
	}

}
