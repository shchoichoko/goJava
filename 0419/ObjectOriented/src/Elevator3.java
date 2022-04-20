
public class Elevator3 extends Elevator2 {
	// #20 오버라이딩 엘리베이터3 22.04.20 최수혁
	Elevator3(){
		k41_help = "엘리베이터  준공완료";
		System.out.println(k41_help);
	}
	void repair() {	// repair 메소드 추가.
		k41_help = String.format("수리중입니다.");	// 수리중입니다 라는 
		//문자열 저장.
	}
	
	void up() {
		//최상위 층에 있을 때는 마지막 층이라는 메세지를, 
		//아닐 때는 층수를 두층 더하고 현재 층을 알려주는 메시지를 help에 저장.
		//한 층을 다시 내려간다.
		if(k41_floor >= k41_limit_up_floor) {
			k41_help = "마지막 층입니다";
		} else {
			k41_floor = k41_floor + 2;
			k41_help = String.format("%d층입니다",k41_floor);
		}
		this.down();
	}
	
	void down() {	//엘리베이터가 내려감.
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k41_help);
	}
	
}
