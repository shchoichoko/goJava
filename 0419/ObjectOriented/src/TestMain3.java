
public class TestMain3 {
	// #17 상속 엘리베이터3 테스트 22.04.20 최수혁
	
	public static void main(String[] args) {
		Elevator3 k41_elev3 = new Elevator3();
		// Elevator3 객체를 생성한다. 
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//상속받은 up()함수를 이용해 층수를 10번 올린다.
			k41_elev3.up();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//상속받은 down()함수를 이용해 층수를 10번 내린다.
			k41_elev3.down();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		} 
		//Elevator의 함수도 사용 가능하다.
		k41_elev3.repair();
		System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		
	}

}
