
public class AccumulateSum {

	public static void main(String[] args) {
		// #2 ���� �հ� . 22.04.14 . csh
		int k41_sum = 0; // �հ踦 ���� ���� ���� �� �ʱ�ȭ.
		for(int i = 1; i < 101; i++) {
			k41_sum += i;
		}
		System.out.printf("#2 : %d\n", k41_sum);	// k41_sum ���� �հ� ���
		System.out.printf("#2-2 : %d\n", k41_sum/100); // �����հ��� ��� ���
		
		int [] k41_v = {1, 2, 3 ,4 ,5};	// �迭 ���� �� 5�� ũ����ʱ�ȭ
		int k41_vSum = 0;
		
		for(int k41_i = 0; k41_i < k41_v.length; k41_i++) {	// k41_vSum�� k41_v�迭�� ���� ������� ���Ѵ�.
			k41_vSum += k41_v[k41_i];
		}
		
		System.out.printf("#2-3 : %d\n", k41_vSum);	// k41_v�迭 ���� �� ��� 
		
	}

}
