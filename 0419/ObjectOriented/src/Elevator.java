
public class Elevator {
	//#4 클래스 객체 인스턴스 22.04.19 최수혁
	int k41_limit_up_floor = 10; // 최상위 층
	int k41_limit_down_floor = 0;	//최하위 층
	int k41_floor = 1;	//현재 층
	String k41_help;
	
	void Up() {
		if(k41_floor == k41_limit_up_floor) {
			k41_help = "마지막 층입니다.";
		} else {
			k41_floor++;
			k41_help = String.format("%d층입니다.",k41_floor);
		}
	}

	void down() {
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "처음층입니다.";
		} else {
			k41_floor--;
			k41_help = String.format("%d층입니다.", k41_floor);
		}
	}
}
