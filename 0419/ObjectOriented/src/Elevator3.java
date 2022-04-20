
public class Elevator3 extends Elevator2 {
	// #16 상속 엘리베이터3 22.04.20 최수혁
	void repair() {	// repair 메소드 추가.
		k41_help = String.format("수리중입니다.");	// 수리중입니다 라는 문자열 저장.
	}
	
	void up() {
		if(k41_floor >= k41_limit_up_floor) {
			k41_help = "마지막 층입니다";
		} else {
			k41_floor = k41_floor + 2;
			k41_help = String.format("%d층입니다",k41_floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k41_help);
	}
	
}
