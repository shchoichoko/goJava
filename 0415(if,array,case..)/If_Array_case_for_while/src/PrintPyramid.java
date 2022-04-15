
public class PrintPyramid {

	public static void main(String[] args) {
		// #16 피라미드 모양 찍기 22.04.15 csh 
		int k41_n, k41_m;	//각 각 별의 갯수와 빈칸 갯수를 위해 변수를 선언.
		k41_n = 1; k41_m = 20;	// 초기 별의 갯수를 1, 빈칸 갯수를 20으로 지정.
		
		while(true) {
			for(int k41_i = 0; k41_i < k41_m; k41_i++) {
				System.out.printf(" ");	//k41_m의 값에 따라 빈칸 출력 
			}
			for(int k41_i = 0; k41_i < k41_n; k41_i++) {
				System.out.printf("*");	//k41_n의 값에 따라 별 출력 
			}
			System.out.printf("\n");
			k41_m = k41_m - 1;	// 빈칸 갯수를 하나씩 줄이고, break문을 만나기  위함.
			k41_n = k41_n + 2;	// 별의 갯수를 2씩 증가시킴.
			
			if (k41_m < 0) break;	// k41_m이 0보다 작아지면 반복문 종료.
		}
		
		
	}

}
