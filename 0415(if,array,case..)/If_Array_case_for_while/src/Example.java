
public class Example {

	public static void main(String[] args) {
		//#6 범위를 주어 비교(찾기) 22.04.15 csh
		int k41_iVal;	//합을 위한 변수 선언.
		for(int k41_i = 0; k41_i < 300; k41_i++) {		// k41_i 값을 0으로 초기화하고, 값이 300미만일 때 아래 문장들을 수행하고, 1을 증가시킴
			k41_iVal = 5 * k41_i;						// k41_iVal 에 k41_i에 5를 곱한 값을 저장. 5의 배수.
			if(k41_iVal >= 0 && k41_iVal < 10) System.out.printf("일 %d\n",k41_iVal);	// k41_iVal 한자릿 수(0이상10미만) 일때 문장을 수행한
			else if(k41_iVal >= 10 && k41_iVal < 100) System.out.printf("십 %d\n",k41_iVal);	//k41_iVal 두자릿 수(10이상 100미만) 일때 문장을 수행한다.
			else if(k41_iVal >= 100 && k41_iVal < 1000) System.out.printf("백 %d\n",k41_iVal); //k41_iVal 세자릿 수(100이상 1000미만) 일때 문장을 수행한다.
			else System.out.printf("천 %d\n",k41_iVal);	// 그 외의 수 일때 문장을 수행.
		}
	}

}
