
public class PrintBlank {
	// #14 ���� 22.04.15 csh
	public static void main(String[] args) {
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {	// 0���� 9���� �ݺ� 
			
			for(int k41_j = 0; k41_j < k41_i; k41_j++)	//0���� 8���� �ݺ�
				System.out.printf(" ");					//k41_i�� -1 ��ŭ ��ĭ ���
			
			System.out.printf("%d\n",k41_i);		// k41_i �� ���.
		}
		
	}

}
