
public class ArrayCalendar {
	// #11 Array�̿� �� 22.04.15 csh
	public static void main(String[] args) {
		int [] k41_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ������ ������ ���ڸ� �迭�� �����.
		
		for(int k41_i = 1; k41_i < 13; k41_i++) {	//���� ������ ���ϱ� ����.
			System.out.printf(" %d�� =>", k41_i); 	//������ ǥ�⸦ ���� ��.
			
			for(int k41_j = 1; k41_j < 32; k41_j++) {	//���� ������ 31�ϱ����� ���ϱ� ����.
				System.out.printf("%d", k41_j);		//���� ǥ���ϱ� ����.
				
				if(k41_iLMD[k41_i-1]==k41_j) {	// k41_i-1�� �迭���� ���� ���� ��ġ��Ű�� ����. ex) 2�� => k41_iLMD[1] 
					break;						//���� ������ ���ڼ��� ������ �ݺ��� �����.
				}
				System.out.printf(",");			//������ ���� ���� �� �޸� ���� ���� break�� �ؿ� ��ġ��.
			}
			System.out.println("\n");			//������ ���� �� ���� ����.
		}
		
		
	}

}
