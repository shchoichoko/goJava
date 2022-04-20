
public class MyTest {
	// #13 생성자 엘리베이터2 테스트 22.04.20 최수혁
	static Elevator2 k41_elev1;		//생성자를 각각 생성한다.
	static Elevator2 k41_elev2;
	static Elevator2 k41_elev3;

	public static void main(String[] args) {
		k41_elev1 = new Elevator2();	// 기본 세팅 엘리베이터 생성
		k41_elev2 = new Elevator2(20, 1, 8); // 최대,최저,현재층을 새로 세팅한 엘리베이터
		k41_elev3 = new Elevator2(50, -3, 5); // 최대,최저,현재층을 새로 세팅한 엘리베이터
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			//한층 올라가기를 20번 반복하는 식
			k41_elev1.up(); k41_elev1.msg("1번엘레 한층 오르기");
		}
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			//2층씩 올라가기를 20번 반복하는 식
			k41_elev1.up(2); k41_elev1.msg("1번엘레 2층씩 오르기");
		}
		
		for(int k41_i = 0; k41_i < 20; k41_i++) {
			//3층씩 내려가는걸 20번 반복하는 식.
			k41_elev1.down(3); k41_elev1.msg("1번엘레 3층씩 내려오기");
		}
		
	}

}
