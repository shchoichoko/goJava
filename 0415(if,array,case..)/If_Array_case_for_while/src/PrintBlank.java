
public class PrintBlank {
	// #14 띄어쓰기 22.04.15 csh
	public static void main(String[] args) {
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {	// 0부터 9까지 반복 
			
			for(int k41_j = 0; k41_j < k41_i; k41_j++)	//0부터 8까지 반복
				System.out.printf(" ");					//k41_i값 -1 만큼 빈칸 출력
			
			System.out.printf("%d\n",k41_i);		// k41_i 값 출력.
		}
		
	}

}
