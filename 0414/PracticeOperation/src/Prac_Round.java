
public class Prac_Round {

	public static void main(String[] args) {
		// #4 반올림 버림 처리 . 22.04.14 . csh
		int k41_ii = 12345;	// 반올림 처리를 위해 변수 선언 및 초기화
		int k41_j = (k41_ii / 10) * 10;		// 10을 나눈 몫에 다시 10을 곱해서 처음 수의 일의 자리수를 버림 처리함.
		System.out.printf("#4-1 : %d\n", k41_j);
		
		k41_ii = 12345;		
		k41_j = ((k41_ii+5)/10)*10;		// 5를 더해서 5이상의 일의 자리수는 십의 자리수 값을 +1 해주고 10으로 나누고 다시 10을 곱함. 일의 자리 반올림.
		System.out.printf("#4-2 : %d\n" , k41_j);
		
		k41_ii = 12344;
		k41_j = ((k41_ii+5)/10)*10;		// 해당 식이 반올림이 제대로 되는지 확인 하기 위함. 일의 자리수가 4이기 때문에 십의 자리수에 변화가 없음.
		System.out.printf("#4-2 : %d\n" , k41_j);
	
		
	}

}
