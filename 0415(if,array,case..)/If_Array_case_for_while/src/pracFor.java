
public class pracFor {

	public static void main(String[] args) {
		// #3 기본 for문과 복합 for문 22.04.15 csh 
		int k41_sum = 0;							// 합계 값을 저장할 변수를 선언하고 0으로 초기화한다.
		for(int k41_i = 0; k41_i < 10; k41_i++) {	// k41_i의 값은 0이고, k41_i값이 10미만 일때, 아래 문장을 수행하고 값을 1 더한다.
			k41_sum += k41_i;						// k41_i의 값이 10 미만 일때, k41_sum에 k41_i 값을 더한다.
		}
		System.out.printf("sum : %d\n", k41_sum);	// k41_sum 값을 출력한다.
		
		for(int k41_i = 1; k41_i < 10; k41_i++) {				// 단수를 지정하는 부분. 1단~9단 까지 되도록 설정되어 있다.
			System.out.printf("****************************\n");
			System.out.printf("	구구단 %d 단\n", k41_i);		// 구구단 몇단인지 먼저 출력해주는 부분.
			System.out.printf("****************************\n");
			for(int k41_j = 1; k41_j < 10; k41_j++) {			// 바깥 for문에서 단수를 정해놓으면 이제 1~9까지 출력한다.
				System.out.printf(" %d * %d = %d \n", k41_i, k41_j, k41_i*k41_j);	// 구구단 형식을 맞추고 곱한 값을 출력하는 부분
			}
			
		}
	}
	
}
