
public class SinGraph {

	public static void main(String[] args) {
		// #15 sin 함수 그래프 22.04.15 csh 
		double k41_fSin;		// double 형식으로 선언.
		for(int k41_i = 0; k41_i < 360; k41_i++) {	//0~ 359도까지 범위 정하고 반복.
			k41_fSin = Math.sin(k41_i * 3.141592/180);		// 
			System.out.printf("%d sin ==> %f\n", k41_i, k41_fSin);
		}
		
		for(int k41_i = 0; k41_i < 360; k41_i++) {	//0~ 359도까지 범위 정하고 반복.
			k41_fSin = Math.sin(k41_i * 3.141592/180);	// 라디언 값을 구하기 위해 (각도 * PI/180)을 해주고, Math.sin을 통해 해당 sin값을 구해준다.
			
			int k41_iSpace = (int)((1.0 - k41_fSin) * 50); // 빈칸을 늘리는 용도. 더 높은 수를 곱할수록 폭이 넓어진다.
			for(int k41_j = 0; k41_j < k41_iSpace; k41_j++) {
				System.out.printf(" ");	// 빈칸을 출력한다.
			}
			System.out.printf("*[%f][%d]\n", k41_fSin, k41_iSpace);	//sin 값과 위에서 나온 빈칸수를 출력한다.
		}
		
	}

}
