
public class IntegerOperate {

	public static void main(String[] args) {
		// #3 정수형 연산(버림) . 22.04.14 . csh
		int k41_ii = 1000 / 3;	//몫을 구하는 식
		System.out.printf("#3-1 : %d\n", k41_ii);
		
		k41_ii = 1000 % 3;	//나머지를 구하는 식 
		System.out.printf("#3-2 : %d\n", k41_ii);
		
		//나머지 연산자의 응용
		for(int i = 0; i < 20; i++) {	//20번을 반복 하는 식
			System.out.printf("#3-3 : %d\n", i);		
			
			if(i % 5 == 0) {	// 5의 배수일때 한줄을 띄우기 위함
				System.out.println("");
			}
		}
	}

}
