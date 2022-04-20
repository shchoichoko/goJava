
public class Elevator {
	//#4 클래스 객체 인스턴스 22.04.20 최수혁
	int k41_limit_up_floor = 10; // 최상위 층
	int k41_limit_down_floor = 0;	//최하위 층
	int k41_floor = 1;	//현재 층
	String k41_help;	// 문자열 출력을 위한 변수 선언.
	
	void Up() {	
		//최상위 층에 있을 때는 마지막 층이라는 메세지를, 
		//아닐 때는 층수를 하나 더하고 현재 층을 알려주는 메시지를 help에 저장.
		if(k41_floor == k41_limit_up_floor) {
			k41_help = "마지막 층입니다.";
		} else {
			k41_floor++;
			k41_help = String.format("%d층입니다.",k41_floor);
		}
	}
	
	void down() {
		//최저층에 있을 때는 1층이라고 메시지를 help에 저장하고.
		//아닐 때는 현재 층수에서 1을 빼주고, 현재 층수를 알려주는 메시지를 help에 저장.
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "1층입니다.";
		} else {
			k41_floor--;
			k41_help = String.format("%d층입니다.", k41_floor);
		}
	}
}
