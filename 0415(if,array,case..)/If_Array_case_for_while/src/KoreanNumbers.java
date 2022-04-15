
public class KoreanNumbers {
	// #12 숫자읽기 22.04.15 csh
	public static void main(String[] args) {
		String [] k41_units = {"영","일","이","삼","사","오","육","칠","팔","구"};	//0~9까지 한글로 적어, 문자열 배열로 만듬.
		for(int k41_i = 0; k41_i < 101; k41_i++) {	// 0~100까지 반복하기 위함.
			
			if(k41_i >= 0 && k41_i < 10) {	// k41_i값이 일의 자리 일때 아래 문장을 수행함.
				System.out.printf("일의자리 : %s\n", k41_units[k41_i]);	//k41_i값이 일의 자리일때 해당 자리의 문자를 출력함.
			}
			else if(k41_i >= 10 && k41_i < 100) { //k41_i의 값이 십의 자리 일때 아래 문장을 수행함.
				int k41_i10, k41_i0;
				k41_i10 = k41_i/10;	// 십의 자리 수를 배열로 출력하기 위해 일의 자릿수를 버림.
				k41_i0 = k41_i%10;	// 일의 자리 수를 배열로 출력하기 위해 십의 자릿수를 버림.
				if(k41_i0 == 0) {
					System.out.printf("십의 자리 : %s십\n", k41_units[k41_i10]);	// k41_i의 값이 10의 배수일때, 이 문장을 출력.
				} else {
					System.out.printf("십의 자리 : %s십%s\n", k41_units[k41_i10],k41_units[k41_i0]);	//위에서 구한 십의 자릿수, 일의 자릿수를 '십'을 가운데로 놓고 출력.
				}
				
			}
			else System.out.printf("==> %d\n", k41_i);
			
			
		}
		
		
	}

}
