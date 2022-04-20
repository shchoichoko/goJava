
public class CalculateGradesTest {
	// #11 메소드 오버로딩 성적표 계산 테스트 22.04.20 최수혁
	public static void main(String[] args) {
		printTitle(3);	//3과목에 해당하는 성적표 헤더 텍스트 부분을 불러오는 함수.
		printGrades(3);	//3과목에 해당하는 각 과목별 점수, 총점, 평균을 표기해주는 함수.
		printTitle(4);	//4과목에 해당하는 성적표 헤더 텍스트 부분을 불러오는 함수.
		printGrades(4);	//4과목에 해당하는 각 과목별 점수, 총점, 평균을 표기해주는 함수.
		printTitle(5);	//5과목에 해당하는 성적표 헤더 텍스트 부분을 불러오는 함수.
		printGrades(5);	//5과목에 해당하는 각 과목별 점수, 총점, 평균을 표기해주는 함수.
	}

	public static void printTitle(int k41_order) {
		//매개변수로 받는 숫자에 따라 다른 타이틀을 프린트함.
		if (k41_order == 3) {
			System.out.println(k41_order + "월 성적표");
			System.out.println("==========================================");
			System.out.println("이름     국어   영어   수학   총점   평균");
			System.out.println("==========================================");
		} else if (k41_order == 4) {
			System.out.println(k41_order + "월 성적표");
			System.out.println("===============================================");
			System.out.println("이름    국어   영어   수학   과학  총점  평균");
			System.out.println("===============================================");

		} else {
			System.out.println(k41_order + "월 성적표");
			System.out.println("===============================================");
			System.out.println("이름  국어  영어  수학  과학  사회 총점  평균");
			System.out.println("===============================================");
		}
	}

	public static void printGrades(int k41_order) {
		CalculateGrades k41_calG = new CalculateGrades();
		//계산해주는 클래스의 객체를 생성.
		int k41_korean = 100;
		int k41_english = 100;
		int k41_math = 100;
		int k41_science = 100;
		int k41_society = 100;
		double k41_avg = 0;
		int k41_sum = 0;
		if (k41_order == 3) {
			//sum()함수로 3과목의 점수를 합산해서, k41_sum에 저장.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math);
			//avg()함수에 위에서 구한 합과 과목수를 넣어서 평균값 구하기.
			k41_avg = k41_calG.avg(k41_sum, 3);
			System.out.printf("폴리융   %4d   %4d   %4d   %4d   %4.0f\n\n", 
					k41_korean, k41_english, k41_math, k41_sum, k41_avg);
		} else if (k41_order == 4) {
			//sum()함수로 4과목의 점수를 합산해서, k41_sum에 저장.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, 
					k41_science);
			//avg()함수에 위에서 구한 합과 과목수를 넣어서 평균값 구하기.
			k41_avg = k41_calG.avg(k41_sum, 4);
			System.out.printf("폴리융  %4d   %4d   %4d   %4d  %4d %5.1f\n\n", 
					k41_korean, k41_english, k41_math, k41_science,
					k41_sum, k41_avg);
		} else {
			//sum()함수로 5과목의 점수를 합산해서, k41_sum에 저장.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, k41_science, 
					k41_society);
			//avg()함수에 위에서 구한 합과 과목수를 넣어서 평균값 구하기.
			k41_avg = k41_calG.avg(k41_sum, 5);
			System.out.printf("폴리융%4d  %4d  %4d  %4d  %4d %4d %4.1f\n\n", k41_korean, k41_english,
					k41_math, k41_science,
					k41_society, k41_sum, k41_avg);
		}
	}

}
