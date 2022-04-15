
public class AccumulateSum {

	public static void main(String[] args) {
		// #2 누적 합계 . 22.04.14 . csh
		int k41_sum = 0; // 합계를 넣을 변수 선언 및 초기화.
		for(int i = 1; i < 101; i++) {
			k41_sum += i;
		}
		System.out.printf("#2 : %d\n", k41_sum);	// k41_sum 누적 합계 출력
		System.out.printf("#2-2 : %d\n", k41_sum/100); // 누적합계의 평균 출력
		
		int [] k41_v = {1, 2, 3 ,4 ,5};	// 배열 선언 및 5의 크기로초기화
		int k41_vSum = 0;
		
		for(int k41_i = 0; k41_i < k41_v.length; k41_i++) {	// k41_vSum에 k41_v배열의 값을 순서대로 합한다.
			k41_vSum += k41_v[k41_i];
		}
		
		System.out.printf("#2-3 : %d\n", k41_vSum);	// k41_v배열 합한 값 출력 
		
	}

}
