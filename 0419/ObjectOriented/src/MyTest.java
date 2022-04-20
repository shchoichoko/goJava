
public class MyTest {
	// #13 생성자 엘리베이터2 테스트 22.04.20 최수혁
	static Elevator2 k41_elev1;
	static Elevator2 k41_elev2;
	static Elevator2 k41_elev3;

	public static void main(String[] args) {
		k41_elev1 = new Elevator2();
		k41_elev2 = new Elevator2(20, 1, 8);
		k41_elev3 = new Elevator2(50, -3, 5);
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			k41_elev1.up(); k41_elev1.msg("1번엘레 한층 오르기");
		}
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			k41_elev1.up(2); k41_elev1.msg("1번엘레 2층씩 오르기");
		}
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			k41_elev1.down(3); k41_elev1.msg("1번엘레 3층씩 내려오기");
		}
		
	}

}
