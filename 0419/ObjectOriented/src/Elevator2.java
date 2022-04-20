
public class Elevator2 {
	//#12 생성자 엘리베이터2 22.04.20 최수혁
	public int k41_limit_up_floor;	//최상위층
	public int k41_limit_down_floor;	//최저층
	public int k41_floor;	//현재 층수
	public String k41_help;	//문자열 저장을 위한 변수.
	
	Elevator2(){
		// 기본 엘리베이터.
		k41_limit_up_floor = 10;	//최대층은 10층.
		k41_limit_down_floor = 1;	//최저층은 1층.
		k41_help = "엘리베이터 기본 준공완료";
	}
	
	Elevator2(int k41_up_floor, int k41_d_floor, int k41_in_floor){
		//객체를 생성할 때, 최상위층, 현재층, 최저층을 순서대로 넣어서 설정할 수 있다.
		k41_limit_up_floor = k41_up_floor;
		k41_limit_down_floor = k41_d_floor;
		k41_help = "엘리베이터 맞춤 준공완료";
	}
	
	void up() {
		//최상위 층에 있을 때는 마지막 층이라는 메세지를, 
		//아닐 때는 층수를 하나 더하고 현재 층을 알려주는 메시지를 help에 저장.
		if(k41_floor == k41_limit_up_floor-1) {
			k41_help = "마지막 층입니다";
		} else {
			k41_floor++;
			k41_help = String.format("[%d]층입니다", k41_floor);
		}
	}
	
	void down() {
		//최저층에 있을 때는 처음층이라는 메세지를, 
		//아닐 때는 층수를 하나 빼고 현재 층을 알려주는 메시지를 help에 저장.
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "처음 층입니다";
		} else {
			k41_floor--;
			k41_help = String.format("[%d]층입니다", k41_floor);
		}
	}
	
	void up(int k41_u) {
		//매개변수로 넣은 숫자에 따라 층수가 올라감.
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.up();
		}
	}
	
	void down(int k41_u) {
		//매개변수로 넣은 숫자에 따라 층수가 내려감.
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			down();
		}
	}
	
	void msg(String k41_id) {
		//메세지 출력을 위한 변수.
		//매개변수엔 문자열을 넣는데, 여기선 엘리베이터 이름이 사용된다.
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", 
				k41_id, k41_help, k41_limit_up_floor, k41_limit_down_floor, k41_floor);
	}


}
