
public class MultipleTable {

	public static void main(String[] args) {
		// #1 구구단 인쇄(1) 22.04.18. 최수혁
		//1단부터 9단까지 단 출력. k41_i+3은 그다음 단수를 3단씩 늘리기 위함.
		for(int k41_i = 1; k41_i < 10; k41_i=k41_i+3) {	
			System.out.printf("**************\t**************\t**************\n");
			System.out.printf("  구구단 %d 단\t구구단 %d 단\t구구단 %d 단  \n", k41_i, k41_i+1, k41_i+2);	
			//1단씩 오른쪽으로 k41_i+2까지 표현하기 위한 문장
			System.out.printf("**************\t**************\t**************\n");
			for(int k41_j = 1; k41_j < 10; k41_j++) {	
				//단수에 1부터 9까지 반복적으로 곱하기 위한 식
				//위에서 1단씩 오른쪽으로 추가하기 때문에 각각 표현해줌.
				System.out.printf(" %d * %d = %d  \t", k41_i, k41_j, k41_i * k41_j);	
				System.out.printf(" %d * %d = %d  \t", k41_i+1, k41_j, (k41_i+1) * k41_j);	
				System.out.printf(" %d * %d = %d  \t\n", k41_i+2, k41_j, (k41_i+2) * k41_j);	
			}
		}
	}

}
