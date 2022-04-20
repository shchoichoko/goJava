
public class CalculateGrades {
	//#10 메소드 오버로딩 성적표 계산 22.04.20 최수혁
	
	int sum(int k41_a, int k41_b, int k41_c) {
		//매개변수 3개를 받아 더해서 리턴. (국어 영어 수학)
		return k41_a + k41_b + k41_c;
	}

	int sum(int k41_a, int k41_b, int k41_c, int k41_d) {
		//매개 변수 4개를 받아 더해서 리턴. (국어 영어 수학 과학)
		return k41_a + k41_b + k41_c + k41_d;
	}
	
	int sum(int k41_a, int k41_b, int k41_c, int k41_d, int k41_f) {
		//매개변수 5개를 받아 더해서 리턴.(국어 영어 수학 과학 사회)
		return k41_a + k41_b + k41_c + k41_d + k41_f;
	}
	
	double avg(int k41_sum, int k41_num) {
		// 매개변수 2개를 받아서 나눠주기. 
		//점수와 과목수를 받아서 평균 리턴해주기.
		return k41_sum/k41_num;
	}
	
}
