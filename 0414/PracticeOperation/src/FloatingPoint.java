
public class FloatingPoint {

	public static void main(String[] args) {
		// #5 소수점 자리의 반올림 버림 처리 22.04.14 . csh
		int k41_MyVal = 14 / 5;		//정수형 나누기
		System.out.printf("#5-1 : %d\n", k41_MyVal);
		
		double k41_MyValF = 14 / 5;		// double 이지만 정수로만 계산해서 원하는 값이 안나옴.
		System.out.printf("#5-2 : %f\n", k41_MyValF);
		
		k41_MyValF = 14.0 / 5;		//뒤에 .0을 붙인 상태로 계산하여 실수형 계산 됨.
		System.out.printf("#5-3 : %f\n", k41_MyValF);
		
		k41_MyValF = 14.0 / 5 + 0.5;//뒤에 소수점을 붙인 상태로 계산하여 실수형 계산 됨.
		System.out.printf("#5-4 : %f\n", k41_MyValF);
		
		k41_MyVal = (int)((14.0)/5+0.5); //int로 형변환을 해줬기 때문에 정수형 변수를 이용하여 값 저장.
		System.out.printf("#5-5 : %d\n", k41_MyVal);
	}

}
