
public class CalculateGrades {
	//#10 �޼ҵ� �����ε� ����ǥ ��� 22.04.20 �ּ���
	
	int sum(int k41_a, int k41_b, int k41_c) {
		//�Ű����� 3���� �޾� ���ؼ� ����. (���� ���� ����)
		return k41_a + k41_b + k41_c;
	}

	int sum(int k41_a, int k41_b, int k41_c, int k41_d) {
		//�Ű� ���� 4���� �޾� ���ؼ� ����. (���� ���� ���� ����)
		return k41_a + k41_b + k41_c + k41_d;
	}
	
	int sum(int k41_a, int k41_b, int k41_c, int k41_d, int k41_f) {
		//�Ű����� 5���� �޾� ���ؼ� ����.(���� ���� ���� ���� ��ȸ)
		return k41_a + k41_b + k41_c + k41_d + k41_f;
	}
	
	double avg(int k41_sum, int k41_num) {
		// �Ű����� 2���� �޾Ƽ� �����ֱ�. 
		//������ ������� �޾Ƽ� ��� �������ֱ�.
		return k41_sum/k41_num;
	}
	
}
