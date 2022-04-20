
public class CalculateGrades {
	//#10 메소드 오버로딩 성적표 계산 22.04.20 최수혁
	
	int sum(int k41_a, int k41_b, int k41_c) {
		return k41_a + k41_b + k41_c;
	}

	int sum(int k41_a, int k41_b, int k41_c, int k41_d) {
		return k41_a + k41_b + k41_c + k41_d;
	}
	
	int sum(int k41_a, int k41_b, int k41_c, int k41_d, int k41_f) {
		return k41_a + k41_b + k41_c + k41_d + k41_f;
	}
	
	double avg(int k41_sum, int k41_num) {
		return k41_sum/k41_num;
	}
	
}
