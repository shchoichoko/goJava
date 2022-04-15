
public class whilePrintStars {

	public static void main(String[] args) {
		//#4 While문을 사용해서 별 찍기 22.04.15 csh
		
		int k41_iA, k41_iB;		// k41_iA 는 줄바꿈을 위한 변수, k41_iB 는 별 찍기를 위한 변수이다.
		k41_iA = 0;				// k41_iA의 값을 0으로 초기화한다.
		while(true) {			// break문으로 나오기 전까지 반복하려는 식
			k41_iB = 0;			// 밑에서 변경되었던 k41_iB값을 0으로 다시 초기화 해줌.
			while(true) {		// break로 빠져나올 때까지 무한 반복
				System.out.printf("*");	// 별 출력
				
				if(k41_iA == k41_iB) {	 
					break;			// k41_iA와 k41_iB의 값이 같을 때 속한 while문 빠져나가기
				}
				k41_iB++;		//k41_iB값 1증가( k41_iA의 값에 도달하기 위함)
			}
			System.out.printf("\n");	// 줄 바꾸기
			k41_iA++;					// 별의 개수를 늘리기 위한 용도 + 30일때 빠져나가기 위한 용도.
			if(k41_iA == 30) break;	// k41_iA 가 30일때 while문 밖으로 빠져나가기.
		}
		
	}

}
