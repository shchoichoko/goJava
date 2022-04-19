
public class MultipleTable2 {

	public static void main(String[] args) {
		// #2 구구단 인쇄(2) 22.04.18. 최수혁

		for (int k41_i = 1; k41_i < 4; k41_i++) {	
			// 아래로 3단까지만 표현하기 때문에 1부터 3단까지만 출력.
			System.out.printf("**************\t**************\t**************\n");
			//3단씩 오른쪽으로 증가하여 k41_i+6까지 표현하기 위한 문장
			System.out.printf("  구구단 %d 단\t 구구단 %d 단\t 구구단 %d 단\n", k41_i, k41_i + 3, k41_i + 6);
			System.out.printf("**************\t**************\t**************\n");
			for (int k41_j = 1; k41_j < 10; k41_j++) {	
				//단수에 1부터 9까지 반복적으로 곱하기 위한 식
				//위에서 3단씩 오른쪽으로 추가하기 때문에 각각 표현해줌.
				System.out.printf(" %d * %d = %d  \t", k41_i, k41_j, k41_i * k41_j); 
				System.out.printf(" %d * %d = %d  \t", k41_i + 3, k41_j, (k41_i + 3) * k41_j); 
				System.out.printf(" %d * %d = %d  \t\n", k41_i + 6, k41_j, (k41_i + 6) * k41_j); 
			}
		}

	}

}
