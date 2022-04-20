
public class TestMain3 {
	// #17 상속 엘리베이터3 테스트 22.04.20 최수혁
	
	public static void main(String[] args) {
		Elevator3 k41_elev3 = new Elevator3();
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_elev3.up();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_elev3.down();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		} 
		
		k41_elev3.repair();
		System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		
	}

}
