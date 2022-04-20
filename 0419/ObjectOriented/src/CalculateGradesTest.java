
public class CalculateGradesTest {
	// #11 메소드 오버로딩 성적표 계산 테스트 22.04.20 최수혁
	public static void main(String[] args) {
		printTitle(3);
		printGrades(3);
		printTitle(4);
		printGrades(4);
		printTitle(5);
		printGrades(5);
	}

	public static void printTitle(int k41_order) {
		if (k41_order == 3) {
			System.out.println(k41_order + "월 성적표");
			System.out.println("=======================================");
			System.out.println("이름     국어   영어   수학   총점   평균");
			System.out.println("=======================================");
		} else if (k41_order == 4) {
			System.out.println(k41_order + "월 성적표");
			System.out.println("=======================================");
			System.out.println("이름    국어   영어   수학   과학  총점  평균");
			System.out.println("=======================================");

		} else {
			System.out.println(k41_order + "월 성적표");
			System.out.println("=======================================");
			System.out.println("이름  국어  영어  수학  과학  사회 총점  평균");
			System.out.println("=======================================");
		}
	}

	public static void printGrades(int k41_order) {
		CalculateGrades k41_calG = new CalculateGrades();
		int k41_korean = 100;
		int k41_english = 100;
		int k41_math = 100;
		int k41_science = 100;
		int k41_society = 100;
		double k41_avg = 0;
		int k41_sum = 0;
		if (k41_order == 3) {
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math);
			k41_avg = k41_calG.avg(k41_sum, 3);
			System.out.printf("폴리융   %d   %d   %d   %d   %.0f\n\n", k41_korean, k41_english, k41_math, k41_sum, k41_avg);
		} else if (k41_order == 4) {
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, k41_science);
			k41_avg = k41_calG.avg(k41_sum, 4);
			System.out.printf("폴리융  %d   %d   %d   %d  %d %.1f\n\n", k41_korean, k41_english, k41_math, k41_science,
					k41_sum, k41_avg);
		} else {
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, k41_science, k41_society);
			k41_avg = k41_calG.avg(k41_sum, 5);
			System.out.printf("폴리융 %d  %d  %d  %d  %d %d %.1f\n\n", k41_korean, k41_english, k41_math, k41_science,
					k41_society, k41_sum, k41_avg);
		}
	}

}
